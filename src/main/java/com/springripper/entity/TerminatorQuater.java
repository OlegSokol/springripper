package com.springripper.entity;

import com.springripper.annotation.InjectRandomInt;
import com.springripper.annotation.Profiling;
import com.springripper.entity.Quater;

@Profiling
public class TerminatorQuater implements Quater {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
