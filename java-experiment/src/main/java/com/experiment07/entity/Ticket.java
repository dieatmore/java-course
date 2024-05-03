package com.experiment07.entity;

public class Ticket {
    private int id;
    private String startName;
    private String endName;

    public Ticket(int id, String startName, String endName) {
        this.id = id;
        this.startName = startName;
        this.endName = endName;
    }

    public String getStartName() {
        return startName;
    }

    public void setStartName(String startName) {
        this.startName = startName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndName() {
        return endName;
    }

    public void setEndName(String endName) {
        this.endName = endName;
    }
}
