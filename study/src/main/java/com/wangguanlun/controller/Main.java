package com.wangguanlun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args){

    }

    private static void test1(){
        //1.创建spring的ioc容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        //2.从IOC容器中获取bean的实例
        Test test = (Test) context.getBean("testService");
        test.sayHello();
    }
}
