package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Doctor d = context.getBean(Doctor.class);
//        Nurse n = (Nurse) context.getBean("nurse");
//        d.assist();
//        n.assist();

//        staff s = context.getBean(Doctor.class);
//        s.assist();

        Doctor d = context.getBean(Doctor.class);
        System.out.println(d.getQualification());
    }
}