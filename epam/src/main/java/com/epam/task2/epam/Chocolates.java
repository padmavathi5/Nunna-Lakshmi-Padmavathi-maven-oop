package com.epam.task2.epam;

abstract class Chocolates{
    int quantity;
    int weight;
    double calories;
    Chocolates(int quantity,int weight,double calories){
        this.quantity=quantity;
        this.weight=weight;
        this.calories=calories;
    }
    abstract int getQuantity();
    abstract int getWeight();
    abstract String getName();
}