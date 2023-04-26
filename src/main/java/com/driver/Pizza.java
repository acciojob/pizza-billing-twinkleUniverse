package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    int vegPizzaPrice;
    int nonVegPizzaPrice;

    int cheese;
    int paper_bag;

    int topping_Veg;

    int topping_nonVeg;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
         vegPizzaPrice= 300;
         nonVegPizzaPrice=400;
         cheese=80;
         paper_bag=20;
         topping_Veg=70;
         topping_nonVeg=120;
         if(isVeg) {
             price+=vegPizzaPrice;
             System.out.print("Base Price Of The Pizza: "+vegPizzaPrice+"\n");
         }else {
             price+=nonVegPizzaPrice;
             System.out.print("Base Price Of The Pizza: "+nonVegPizzaPrice+"\n");
         }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        price+=cheese;
        System.out.print("Extra Cheese Added: "+cheese+"\n");

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            price+=topping_Veg;
            System.out.print("Extra Topping Added: "+topping_Veg+"\n");
        }
        else{
            price+=topping_nonVeg;
            System.out.print("Extra Topping Added: "+topping_nonVeg+"\n");
        }

    }

    public void addTakeaway(){
        // your code goes here
        price+=paper_bag;
        System.out.print("Paperbag Added: "+paper_bag+"\n");
    }

    public String getBill(){
        // your code goes here
        bill= String.valueOf(price);
       // System.out.println("Total bill: "+bill+"\n");
        return "Total Price: "+this.bill+"\n";
    }
}
