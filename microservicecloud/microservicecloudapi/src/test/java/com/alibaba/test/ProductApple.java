package com.alibaba.test;

public class ProductApple implements Runnable{

    private FactoryApp factoryApp;

    public ProductApple(FactoryApp app){
        this.factoryApp = app;
    }

    @Override
    public void run() {

        for (;;) {

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            factoryApp.productApple();
        }

    }
}
