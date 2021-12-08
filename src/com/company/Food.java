package com.company;

public abstract class Food implements Nutritious, Consumable{
    String name = null;

    public Food(String name) {
        this.name = name;
    }

    public String GetName(){
        return(this.name);
    }

    public void SetName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Food)){
            return false;
        }
        if (name == null || ((Food) obj).name == null) {
            return false;
        }
        return name.equals(((Food) obj).name);
    }
}
