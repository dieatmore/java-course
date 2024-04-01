package com.experiment03.entity;

public class Manager extends Employee{
    private int level;

    public Manager(String name, int level, double baseSalary) {
        super(name, baseSalary);
        this.name = name;
        this.level = level;
    }

    @Override
    public double calculateSalary() {
        return 0.8 * basesalary * level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
