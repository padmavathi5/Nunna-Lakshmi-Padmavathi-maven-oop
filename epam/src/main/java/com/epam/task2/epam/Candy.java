package com.epam.task2.epam;

class Candy extends Chocolates implements Gift{
    
    Candy(int quantity,int weight,double calories){
        super(quantity,weight,calories);
    }
    public String getName(){
        return "Candy";
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