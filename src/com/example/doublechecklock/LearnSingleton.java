package com.example.doublechecklock;

class A{
    static A obj;
    private A(){
        System.out.println("Instance created");
    }
     public static A getInstance(){  //double check locking
        if (obj==null){              //1st check
            synchronized (A.class){
                if (obj==null){      //2nd check
                    obj = new A();
                }
            }
            return obj;
        }else {
            return obj;
        }
    }
}

public class LearnSingleton {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            A a = A.getInstance();
            System.out.println(a.hashCode());
        });

        Thread t2 = new Thread(() -> {
            A a2 = A.getInstance();
            System.out.println(a2.hashCode());
        });

        t1.start();
        t2.start();
    }
}
