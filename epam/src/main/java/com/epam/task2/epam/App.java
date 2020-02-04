package com.epam.task2.epam;

import java.util.*;
/**
 * Hello world!
 *
 */

public class App
{
    public static void main( String[] args )
    {
    	Gift giftNames[] = new Gift[4];
		giftNames[0]=new Candy(4,20,2.34);
		giftNames[1]=new Carmel(5,70,3.21);
        giftNames[2]=new Laddu(50,3.21);
        giftNames[3]=new Gulab_jamun(30,2.31);
        for(int i=0;i<4;i++){
			if(giftNames[i] instanceof Chocolates) {
				System.out.println("chocolates");
				if(giftNames[i] instanceof Candy){
					Candy c = (Candy) giftNames[i];
					c.getName();
                    System.out.println(c.getCalories());
                    System.out.println("quantity of candy's are "+c.getQuantity());
                    System.out.println("weight of candy's is "+c.getWeight());
				}else
				{
					Carmel S=(Carmel) giftNames[i];
					S.getName();
                    System.out.println("calories of candy's are "+S.getCalories());
                    System.out.println("quantity of candy's are "+S.getQuantity());
                    System.out.println("weight of candy's is "+S.getWeight());
				}
			}
				else
				{
					System.out.println("sweets");
					if(giftNames[i] instanceof Laddu)
					{
						Laddu c1=(Laddu) giftNames[i];
						c1.getName();
						System.out.println(c1.getWeight());
						System.out.println(c1.getCalories());
					}
					else
					{
						Gulab_jamun sp=(Gulab_jamun) giftNames[i];
						sp.getName();
						System.out.println("quantity of candy's are "+sp.getWeight());
						System.out.println("calories of candy's are "+sp.getCalories());
					}
				}
			}
        ArrayList<Chocolates> arr =new ArrayList<Chocolates>();
        for(int i=0;i<4;i++) {
      	  if(giftNames[i] instanceof Chocolates) {
      		  Chocolates c=(Chocolates)giftNames[i];
      		  arr.add(c);
      	  }
        }
        Collections.sort(arr,new Comparator<Chocolates>() {
      	    public int compare(Chocolates  a, Chocolates b) {
      	        return (a.quantity)-(b.quantity);
      	    }
      	});
        System.out.println("Chocolates after sorted by quantity:");
        for(int i=0;i<arr.size();i++) {
      	  System.out.println(arr.get(i).getName()+" :"+arr.get(i).getQuantity());
        }
        int weight=0;
        for(int i=0;i<4;i++) {
      	  weight+=giftNames[i].getWeight();
        }
        int count1=0,count2=0;

        for(int i=0;i<4;i++) {
      	  if(giftNames[i].getWeight()>=50);
      	  count1++;
      	  else
            count2++;
        }
        System.out.println(count1+" items have weight greater than 50");
        System.out.println(count2+" items have weight lower than 50");
        System.out.println("Weight of the gift received by children: "+weight);
          }


}
