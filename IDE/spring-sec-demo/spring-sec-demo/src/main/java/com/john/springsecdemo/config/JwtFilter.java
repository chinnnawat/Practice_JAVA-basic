package com.john.springsecdemo.config;

import com.john.springsecdemo.service.JwtService;
import com.john.springsecdemo.service.MyUserDetailsService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    JwtService jwtService;

    @Autowired
    ApplicationContext context;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // อ่านค่า Authorization header
        String authHeader = request.getHeader("Authorization");
        String token = null;
        String userName = null;

        // ถ้า Authorization header ไม่เป็น null และขึ้นต้นด้วย "Bearer "
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            // แยก Token ออกมา
            token = authHeader.substring(7);
            // ดึงชื่อผู้ใช้ (Username) จาก Token
            userName = jwtService.extractUserName(token);
        }

        // ตรวจสอบการรับรองและกำหนดค่าใน SecurityContextHolder
        if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            // โหลด UserDetails จาก MyUserDetailsService
            UserDetails userDetails = context.getBean(MyUserDetailsService.class).loadUserByUsername(userName);
            // ตรวจสอบความถูกต้องของ Token
            if (jwtService.validateToken(token, userDetails)) {
                // สร้าง AuthenticationToken และกำหนดให้กับ SecurityContextHolder
                UsernamePasswordAuthenticationToken authToken =
                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }

        // ส่ง request ต่อไปยัง FilterChain ถัดไป
        filterChain.doFilter(request, response);
    }
}

