package com.springripper;

import com.springripper.entity.Quater;
import com.springripper.screensaver.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        /*while (true) {
            Thread.sleep(100);
            context.getBean(Quater.class).sayQuote();
        }*/
    }
}
