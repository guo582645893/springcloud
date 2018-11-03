package com.hhf.springcloud;

public class ProductApple implements Runnable{


    private CreateApp createApp;

    public ProductApple(CreateApp app){
        this.createApp = app;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("ProductApple pop===>"+i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            createApp.createApp();
        }


    }
}
