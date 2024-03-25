package com.experiment02.service;

import com.experiment02.entity.Item;
import com.experiment02.entity.Order;
import com.experiment02.entity.Product;
import com.experiment02.entity.User;

import java.text.Format;
import java.text.Normalizer;

public class OrderService {
    public static Order addOrder(User user, Item[] item) {
        double s = user.getBalance();
        double ans = 0;
        for (Item i : item) {
            ans += i.getNumber() * i.getBuy().getPrice();
        }
        if (s >= ans) {
            var order = new Order(user, item, ans);
            user.setBalance(s - ans);
            System.out.println(ans);
            System.out.println(user.getBalance());
            System.out.println(user.getAddress());
            return order;
        } else {
            System.out.println("用户余额不足！");
            return null;
        }
    }
}
