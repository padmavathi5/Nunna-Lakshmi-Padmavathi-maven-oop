package com.epam.task2.epam;

class Carmel extends Chocolates implements Gift{
    
    Carmel(int quantity,int weight,double calories){
        super(quantity,weight,calories);
    }
    public String getName(){
        return "Carmel";
    }
    public int getQuantity(){
        return quantity;
    }
    public double getCalories(){
        return calories;
    }
    public int getWeight(){
        return weight;
    }
}