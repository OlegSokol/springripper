package com.springripper.entity;

import com.springripper.annotation.InjectRandomInt;
import com.springripper.annotation.PostProxy;
import com.springripper.annotation.Profiling;
import com.springripper.entity.Quater;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Profiling
@Component
public class TerminatorQuater implements Quater {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    @Value("I'll be back")
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
