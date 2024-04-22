package com.john.springsecdemo.model;

//@Data /* สร้าง getter, setter, toString(), equals(), และ hashCode() ให้โดยอัตโนมัติสำหรับทุก fields ใน class ที่มี annotation @Data */
//@AllArgsConstructor/* จะสร้าง constructor ที่รับพารามิเตอร์เข้ามาทั้งหมดใน class ให้โดยอัตโนมัติ โดยมีพารามิเตอร์แต่ละตัวจะกลายเป็น field ของ class */
//@NoArgsConstructor /* สร้าง default constructor ที่ไม่รับพารามิเตอร์เข้ามาให้ class โดยอัตโนมัติ */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private int id;
    private String name;
    private String tech;

}

