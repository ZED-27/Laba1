package com.company;

public class Apple extends Food{
    private String size;

    public Apple(String size){
        super("яблоко");
        this.size = size;
    }

    public void SetSize(String size){
        this.size = size;
    }

    public String GetSize(){
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) {
            if (!(obj instanceof Apple)) {
                return false;
            }
            return ((Apple) obj).size.equals(size);
        }
        return false;
    }

    @Override
    public void Consume() {
        System.out.println(this + " съедено");
    }

    @Override
    public int CalculateCalories() {
        if(size.equals("большое")){
            return 30;
        } else if(size.equals("небольшое")){
            return 20;
        } else if(size.equals("среднее")) {
            return 200;
        }
        else {
            return 10;
        }
    }
}

