package com.springripper.controller;

public class ProfilingController implements ProfilingControllerMBean {
    private boolean enableed = true;

    public boolean isEnableed() {
        return enableed;
    }

    public void setEnableed(boolean enableed) {
        this.enableed = enableed;
    }
}
