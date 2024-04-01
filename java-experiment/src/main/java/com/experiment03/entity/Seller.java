package com.experiment03.entity;

public class Seller extends Employee{
    private double saleMuch;
    private double saleCommission;

    public Seller(String name, double saleMuch, double saleCommission, double basesalary) {
        super(name, basesalary);
        this.saleMuch = saleMuch;
        this.saleCommission = saleCommission;
    }

    @Override
    public double calculateSalary() {
        return basesalary + saleCommission * saleMuch;
    }

    public double getSaleCommission() {
        return saleCommission;
    }

    public void setSaleCommission(double saleCommission) {
        this.saleCommission = saleCommission;
    }

    public double getSaleMuch() {
        return saleMuch;
    }

    public void setSaleMuch(double saleMuch) {
        this.saleMuch = saleMuch;
    }
}
