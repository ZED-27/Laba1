package com.company;

public class Cheese extends Food{
    public Cheese(){
        super("сыр");
    }

    @Override
    public int CalculateCalories() {
        return 350;
    }

    @Override
    public void Consume() {
        System.out.println(this + " съедено");
    }
}
