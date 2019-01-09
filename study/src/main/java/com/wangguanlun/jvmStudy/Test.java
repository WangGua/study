package com.wangguanlun.jvmStudy;

public class Test {

    public static void main(String args[]){
        test2();
    }



    private static void test1(){
        /**
         * 由于静态变量是依附于类存在的，静态变量只会属于父类SuperClass，虽然被子类继承。
         * 当JVM加载SubClass时，发现父类SuperClass尚未被加载，所以会优先加载父类。当父类
         * 加载完毕后，正常逻辑代码中Subclass.value的值即会取到，无需再加载子类。
         * （此时父类SuperClass中的静态变量被存在“运行时常量池”中,JDK 1.7 之后 “运行时常量池”被分配到了堆中，
         *  而class文件的常量池还在方法区中，因为class文件一直都是加载到方法区中的）
         */
        System.out.println(SubClass.value);
    }


    private static void test2(){
        /**
         * 被final修饰的静态变量，在编译阶段，就已经被加载到了class文件的常量池中了。
         * 由于编译阶段的常量传播优化，静态变量HELLOWORD其实被加载放入了类Test的
         * 常量池中。所以之后Test类引用静态变量HELLOWORD时，都不会与类ConstClass产生
         * 关系。
         */
        System.out.println(ConstClass.HELLOWORD);
    }
}
