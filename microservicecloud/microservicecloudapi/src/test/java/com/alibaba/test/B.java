package com.alibaba.test;

public class B {


    public void show(){

        System.out.println("class b show");
    }

    static class A extends B{
        public  void show(){
            System.out.println("class a show");

        }

    }

    public static void main(String[] args) {
        String s = null;

        System.out.println("s=" + s);
    }


}
