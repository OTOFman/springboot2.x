package com.otof.springboot2.x.service;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("=== I am riding a bike");
    }
}
