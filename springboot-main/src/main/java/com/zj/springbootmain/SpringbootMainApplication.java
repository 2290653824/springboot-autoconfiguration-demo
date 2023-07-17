package com.zj.springbootmain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.ExecutorService;

@SpringBootApplication
public class SpringbootMainApplication {



    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootMainApplication.class, args);
        ExecutorService myThreadPool = (ExecutorService)context.getBean("myThreadPool");
        System.out.println(myThreadPool);

    }

}
