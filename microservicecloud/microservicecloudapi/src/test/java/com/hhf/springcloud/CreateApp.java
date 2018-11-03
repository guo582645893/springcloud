package com.hhf.springcloud;

import sun.util.resources.cldr.pt.CurrencyNames_pt_ST;

public class CreateApp {


    private int appCount = 0;


    public synchronized void createApp(){

        while(appCount ==5){
            System.out.println("生成结束");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        appCount++;
        System.out.println("生成苹果成功"+appCount);
        notify();

    }

    public synchronized void customerApp(){

        while(appCount ==0){
            System.out.println("消费完成");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        appCount--;
        System.out.println("消费苹果成功");
        notify();

    }

    public static void main(String[] args) {
        CreateApp createApp = new CreateApp();
        ProductApple productApple = new ProductApple(createApp);
        CustomerApple customerApple = new  CustomerApple(createApp);
        Thread t = new Thread(productApple);
        Thread ts = new Thread(customerApple);
        t.start();
        ts.start();


    }



}
