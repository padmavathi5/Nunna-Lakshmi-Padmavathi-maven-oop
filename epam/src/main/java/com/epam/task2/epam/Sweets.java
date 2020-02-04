package com.epam.task2.epam;

abstract class Sweets{
    int weight;
    double calories;
    Sweets(int weight ,double calories){
        this.weight=weight;
        this.calories=calories;
    }
    abstract int getWeight();
}