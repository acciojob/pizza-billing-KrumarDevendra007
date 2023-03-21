package com.driver;

public class Pizza {

    public int price;
    public Boolean isVeg;
    public String bill;
    public int cheesePrice;
    public int basePrice;
    public int bagPrice;
    public int toppingsPrice;
    public int totalPrice;
    boolean isCheeseAdded;
    boolean isToppingAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        //Constructor is used to initialize the attribute of any class
        if(isVeg){
            basePrice = 300;
            toppingsPrice = 70;
        }else{
            basePrice = 400;
            toppingsPrice = 120;
        }
        cheesePrice = 80;
        bagPrice = 20;

        isCheeseAdded = false;
        isToppingAdded = false;
        isPaperBagAdded = false;
        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: "+ basePrice + "\n";

    }

    public int getPrice()
    {
        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            this.totalPrice = totalPrice + cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded == false){
            this.totalPrice = totalPrice + toppingsPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded == false){
            this.totalPrice = totalPrice + bagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){

            if(isCheeseAdded==true){
                bill = bill + "Extra Cheese Added: "+ cheesePrice+"\n";
            }
            if(isToppingAdded==true){
                bill = bill + "Extra Toppings Added: "+ toppingsPrice+"\n";
            }
            if(isPaperBagAdded==true){
                bill = bill + "Paperbag Added: "+ bagPrice+"\n";
            }

            bill = bill + "Total Price: "+ totalPrice+"\n";

            isBillGenerated = true;
        }
        return bill;
    }
}