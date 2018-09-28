package com.hhf.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class DeptProvider8001_App {



    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class, args);
    }
}