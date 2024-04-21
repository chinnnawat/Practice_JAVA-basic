package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/* HelloServlet = /hello */
public class HelloServlet extends HttpServlet {
    /* Method Get */
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In Service");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2><b>Hello</b></h2>");
    }
}
