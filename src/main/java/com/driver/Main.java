package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        //rw.name = "Roshni";
        rw.setName("Roshni");
        String name = rw.getName();
    }
}