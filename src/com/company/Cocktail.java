package com.company;

public class Cocktail extends Food{
    private String drink;
    private String fruit;

    public Cocktail(String drink, String fruit){
        super("коктейль");
        this.drink = drink;
        this.fruit = fruit;
    }

    public void SetDrink(String drink){
        this.drink = drink;
    }

    public void SetFruit(String fruit){
        this.fruit = fruit;
    }

    public String GetDrink(){
        return drink;
    }

    public String GetFruit(){
        return fruit;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)){
            if (!(obj instanceof Cocktail)) {
                return false;
            }
            return (((Cocktail) obj).drink.equals(drink) && ((Cocktail) obj).fruit.equals(fruit));
        }
        return false;
    }

    @Override
    public void Consume() {
        System.out.println(this + " выпито");
    }

    @Override
    public int CalculateCalories() {
        int calories = 0;
        if (drink.equals("молоко")) {
            calories = 40;
        } else if (drink.equals("вода")) {
            calories = 1;
        }else if(drink.equals("спрайт")){
            calories = 500;
        }
        if (fruit.equals("апельсин")) {
            calories += 33;
        } else if (fruit.equals("банан")) {
            calories += 28;
        }else if(fruit.equals("киви")){
            calories+=50;
        }else {
            calories+= 10;
        }
        return calories;
    }

    @Override
    public String toString() {
        return super.toString() + " с добавой '" + drink.toUpperCase() + "' и '" + fruit.toUpperCase() + "'";
    }
}
