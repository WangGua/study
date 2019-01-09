package com.wangguanlun.designModule.singleton;

public class Hungry {
    private Hungry(){
    }

    private static Hungry instance = null;
    public static Hungry getInstance(){
        if (instance == null){
            instance = new Hungry();
        }
        return instance;
    }
}
