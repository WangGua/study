package com.wangguanlun.designModule.singleton;

public class Lazy {
    /**
     * 将构造函数私有化，外部无法通过new 指令生成新的对象
     */
    private Lazy(){
    }
    private static Lazy instance = new Lazy();
    public Lazy getInstance(){
        return instance;
    }
}
