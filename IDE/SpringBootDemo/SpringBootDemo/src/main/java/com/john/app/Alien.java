package com.john.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    /*@Autowired
Annotation @Autowired ใช้ในการบ่งชี้ว่า Spring Framework ควรสร้างและแทรกอ็อบเจกต์ของ Laptop เข้ามาในตัวแปร laptop ของคลาส Alien โดยอัตโนมัติ เมื่อ Alien ถูกสร้างขึ้น*/
    @Autowired
    Laptop laptop;

    public void  code(){
        laptop.complie();
    }
}
