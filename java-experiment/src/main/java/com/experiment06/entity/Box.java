package com.experiment06.entity;

public class Box {
    private int id;
    private int weight;

    public Box(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
