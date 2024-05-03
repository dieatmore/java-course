package com.experiment07.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SellTicket {
    private String name;
    private List<Ticket> sellTickets = new ArrayList<>();
    private static Random random = new Random();

    public SellTicket(String name) {
        this.name = name;
    }

    public synchronized Ticket run(){
        Ticket ticket = null;
        try {
            Thread.sleep(random.nextInt(50));
            ticket = Railway.getTicket();
            if(ticket != null){
                sellTickets.add(ticket);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ticket;
    }

    public List<Ticket> getTickets(){
        return sellTickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ticket> getSellTickets() {
        return sellTickets;
    }

    public void setSellTickets(List<Ticket> sellTickets) {
        this.sellTickets = sellTickets;
    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        SellTicket.random = random;
    }
}
