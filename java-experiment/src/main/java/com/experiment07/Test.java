package com.experiment07;

import com.experiment07.entity.SellTicket;
import com.experiment07.entity.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws InterruptedException{
        List<SellTicket> sellTickets = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(600);
        for (int i=1; i<=3; i++){
            SellTicket sellTicket = new SellTicket("售票点" + i);
            sellTickets.add(sellTicket);
        }
        for (SellTicket sellTicket : sellTickets){
            for (int j = 0;j < 200; j++){
                new Thread(()->{
                    sellTicket.run();
                    countDownLatch.countDown();
                }).start();
            }
        }
        countDownLatch.await();
        for (SellTicket sellTicket : sellTickets){
            System.out.println(sellTicket.getSellTickets().size());
        }
    }
}