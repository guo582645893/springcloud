package com.alibaba.test;

public class CustomerApple implements  Runnable{

    private FactoryApp factoryApp;

    public CustomerApple(FactoryApp app){
        this.factoryApp = app;
    }

    @Override
    public void run() {

        for (;;) {

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            factoryApp.customerApple();
        }

    }
}
