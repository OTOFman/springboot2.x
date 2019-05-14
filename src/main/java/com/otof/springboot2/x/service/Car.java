package com.otof.springboot2.x.service;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("=== I am driving a car!");
    }
}
