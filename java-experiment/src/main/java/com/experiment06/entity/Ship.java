package com.experiment06.entity;

public class Ship {
    private int id;
    private String name;
    private int weight;
    private Box[] boxes;

    public Ship(int id, String name, int weight, Box[] boxes) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.boxes = boxes;
    }

    public Box[] getBoxes() {
        return boxes;
    }

    public void setBoxes(Box[] boxes) {
        this.boxes = boxes;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
