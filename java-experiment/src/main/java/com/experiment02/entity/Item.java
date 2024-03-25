package com.experiment02.entity;

public class Item {
    private Product buy;
    private int number;

    public Item(Product buy, int number) {
        this.buy = buy;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Product getBuy() {
        return buy;
    }

    public void setBuy(Product buy) {
        this.buy = buy;
    }
}
