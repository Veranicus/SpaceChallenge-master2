package com.example.patrickpolacek;

public class Rocket implements SpaceShip {

    Item item = new Item();

    private double weight;
    private double maxWeight;


    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        if (weight + item.getWeight() > maxWeight) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void carry(Item item) {
        weight += item.getWeight();
    }
}
