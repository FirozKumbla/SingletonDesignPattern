package com.example.lazy;

class A{
    static A obj;
    private A(){
        System.out.println("Instance created");
    }
    public static A getInstance(){
        if (obj==null){
            obj = new A();
            return obj;
        }else {
            return obj;
        }
    }
}

public class LearnSingleton {
    public static void main(String[] args) {
        A a = A.getInstance();
        System.out.println(a.hashCode());

        A a2 = A.getInstance();
        System.out.println(a2.hashCode());
    }
}
