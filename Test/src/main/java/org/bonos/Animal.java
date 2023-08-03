package org.bonos;

public abstract class Animal {
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
    public void eat() {

    }
    public void walk() {

    }
}
