package com.example;

class A{
    static A obj = new A();
    private A(){
    }
    public static A getInstance(){
        return obj;
    }
}

public class LearnSingleton {
    public static void main(String[] args) {
        A a = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a.hashCode());
        System.out.println(a2.hashCode());
    }
}
