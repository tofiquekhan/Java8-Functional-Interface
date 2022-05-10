package com.webkorps.j8f;

@FunctionalInterface
public interface A {

    void m1();

    default void m2(){
        System.out.println("m2 Method");
    }

    static  void m3(){
        System.out.println("m3 Method");
    }
}
