package com.driver;

public class Pizza {

    private  int basePrice;
    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppingPrice;
    private  int cheesePrice;
    private int bagPrice;
    private int totalPrice;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenrated;


    public Pizza(Boolean isVeg){

        // your code goes here
        if(isVeg){
            basePrice = 300;
            toppingPrice = 70;
        }
        else{
            basePrice = 400;
            toppingPrice = 120;
        }

        cheesePrice = 80;
        bagPrice = 20;

        totalPrice = basePrice;

        isCheeseAdded = false;
        isToppingAdded = false;
        isPaperBagAdded = false;

        bill = "Base Price Of The Pizza: "+ basePrice + "\n";
    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            totalPrice = totalPrice + cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded == false){
            totalPrice = totalPrice + toppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded == false){
            totalPrice = totalPrice + bagPrice;
            isPaperBagAdded = true;
        }
    }
    public String getBill(){
        // your code goes here
        if(isBillGenrated == false){

            if(isCheeseAdded == true){
                bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";
            }

            if(isToppingAdded == true){
                bill = bill + "Extra Toppings Added: " + toppingPrice + "\n";
            }
            if(isPaperBagAdded == true){
                bill = bill + "Paper bag Price = " + bagPrice + "\n";
            }

            bill = bill + "Total Price: " + totalPrice + "\n";

            isBillGenrated = true;
        }
        return bill;
    }
}
