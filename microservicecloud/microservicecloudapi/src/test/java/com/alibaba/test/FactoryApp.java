package com.alibaba.test;

public class FactoryApp {


    private int appleCount = 0;


    /**
     *
     */
    public synchronized void productApple() {
        while (appleCount == 5) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        appleCount++;
        System.out.println("创建苹果开始。。。。。。appleCount=" + appleCount);
        notify();
    }


    public synchronized void customerApple() {

        while (appleCount == 0) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        appleCount--;
        System.out.println("苹果开始吃了。。。。。。appleCount=" + appleCount);
        notify();

    }

    static volatile int a = 0;

    public static void main(String[] args) {
        /*FactoryApp app = new FactoryApp();
        ProductApple pro = new ProductApple(app);
        CustomerApple cus = new CustomerApple(app);
        Thread pros = new Thread(pro);
        Thread cust = new Thread(cus);
        pros.start();
        cust.start();*/
        float a = 0.2f;
        float b = 0.7f;
        double c = 0.3d;
        double d = 0.7d;
        System.out.println((a+b));
        System.out.println(c+d);


    }


}
