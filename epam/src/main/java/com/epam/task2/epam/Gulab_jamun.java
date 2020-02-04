package com.epam.task2.epam;

class Gulab_jamun extends Sweets implements Gift{
    Gulab_jamun(int weight,double calories){
        super(weight,calories);
    }
    public String getName(){
        return "gulab_jamun";
    }
    public int getWeight(){
        return weight;
    } 
    public double getCalories(){
        return calories;
    }
}