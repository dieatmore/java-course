package com.experiment02.entity;

public class Order {
    private User user;
    private Item[] buyAll;
    private double spend;

    public Order(User user, Item[] buyAll, double spend) {
        this.user = user;
        this.buyAll = buyAll;
        this.spend = spend;
    }

    public double getSpend() {
        return spend;
    }

    public void setSpend(double spend) {
        this.spend = spend;
    }

    public Item[] getBuyAll() {
        return buyAll;
    }

    public void setBuyAll(Item[] buyAll) {
        this.buyAll = buyAll;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
