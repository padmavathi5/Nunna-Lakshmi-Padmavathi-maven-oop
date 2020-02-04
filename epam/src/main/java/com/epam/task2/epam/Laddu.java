package com.epam.task2.epam;


class Laddu extends Sweets implements Gift{
    Laddu(int weight,double calories){
        super(weight,calories);
    }
    public String getName(){
        return "Laddu";
    }
    public int getWeight(){
        return weight;
    } 
    public double getCalories(){
        return calories;
    }
}