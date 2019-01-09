package com.wangguanlun.jvmStudy;

public class ConstClass {

    static {
        System.out.println("ConstClass被初始化");
    }

    public static final String HELLOWORD = "hello world";
}
