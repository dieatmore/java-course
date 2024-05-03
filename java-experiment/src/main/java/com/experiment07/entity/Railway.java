package com.experiment07.entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Railway {
    private static List<Ticket> tickets = create();
    private static List<Ticket> create(){
        List<Ticket> t = new ArrayList<>();
        for(int i = 1; i <= 200;i++){
            t.add(new Ticket(i,"哈尔滨","北京"));
        }
        return t;
    }

    public static synchronized Ticket getTicket(){
        Ticket ticket = null;
        for (Ticket t : tickets){
             if (t != null){
                 ticket = t;
                 break;
             }
        }
        return ticket;
    }


}
