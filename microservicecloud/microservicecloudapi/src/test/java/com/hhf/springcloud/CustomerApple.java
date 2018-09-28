package com.hhf.springcloud;

public class CustomerApple implements Runnable{


    private CreateApp createApp;

    public CustomerApple(CreateApp app){
        this.createApp = app;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("CustomerApple pop===>"+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            createApp.customerApp();
        }


    }
}
