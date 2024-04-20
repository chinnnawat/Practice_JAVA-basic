package com.john.SpringJDBCEx.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private int rollNo;
    private String name;
    private int marks;

    /* Roll */
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    /* Name */
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    /* Marks */
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
}
