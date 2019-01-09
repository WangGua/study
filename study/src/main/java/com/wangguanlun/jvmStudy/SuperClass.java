package com.wangguanlun.jvmStudy;

/**
 * 用于测试类的加载时机
 */
public class SuperClass {

    static {
        System.out.println("父类初始化");
    }

    public static int value = 123;
}
