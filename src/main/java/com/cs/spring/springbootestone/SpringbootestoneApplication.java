package com.cs.spring.springbootestone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;


@SpringBootApplication
public class SpringbootestoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootestoneApplication.class, args);
    }

    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("Let,s inspect the beans provided by Spring Boot:");
            String[] beanNames=ctx.getBeanDefinitionNames();//获取所有类
            Arrays.sort(beanNames);//排序
            for (String beanName : beanNames){
                System.out.println(beanName);
            }
        };
    }

}

