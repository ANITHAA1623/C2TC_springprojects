package com.tnsif.college;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext var = new ClassPathXmlApplicationContext("applicationcontext.xml");

        Student s = var.getBean("student2", Student.class);
        System.out.println(s);

        Student s1 = var.getBean("student1", Student.class);
        System.out.println(s1);
    }
}
