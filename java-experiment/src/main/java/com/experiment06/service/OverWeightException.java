package com.experiment06.service;

public class OverWeightException extends Exception{
    private int id;
    private String name;
    private int overWeight;

    public OverWeightException(int id, String name, int overWeight)  {
        this.id = id;
        this.name = name;
        this.overWeight = overWeight;
    }

    public int getOverWeight() {
        return overWeight;
    }

    public void setOverWeight(int overWeight) {
        this.overWeight = overWeight;
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

    public void errowMessage(){
        System.out.println(this.id + this.name + this.overWeight);
    }
}
