package com.hhf.springcloud;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * Hello world!
 */
public class App {

    private static Object lock = new Object();
    private static Object lock1 = new Object();
    public static void main(String[] args) {
        Thread t = new Thread(new Product());
        Thread ts = new Thread(new Customer());
        t.start();
        ts.start();
    }


    static class Product implements  Runnable{

        int count = 0;

        @Override
        public void run() {

            if(count == 10){
                synchronized (lock){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
            count++;
            System.out.println("product 生产东西。。。。"+count);
            notifyAll();

        }
    }

    static class Customer implements  Runnable{

        int count = 0;

        @Override
        public void run() {

            if(count == 0){
                synchronized (lock1){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
            count--;
            System.out.println("customer 消费东西。。。。"+count);
            notifyAll();

        }
    }


}
