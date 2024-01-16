package com.booleanuk;

public class Option {
    public String userOption;
    public Runnable method;

    public Option(String userOption, Runnable method) {
        this.userOption = userOption;
        this.method = method;
    }
}
