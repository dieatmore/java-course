package com.experiment02;

import com.experiment02.entity.Item;
import com.experiment02.entity.Order;
import com.experiment02.entity.Product;
import com.experiment02.entity.User;
import com.experiment02.service.OrderService;

public class Test {
    public static void main(String[] args) {
        // 模拟创建各种测试数据及对象
        //创建两个产品
        var product1 = new Product("面包", 5.0);
        var product2 = new Product("雪糕", 2.0);
        //创建一个用户
        var user1 = new User("di", 20, "东北林业大学");
        //创建购买商品
        var item1 = new Item(product1, 3);
        var item2 = new Item(product2, 4);
        var item3 = new Item(product1, 1);
        var item4 = new Item(product2, 1);
        Item[] items1 = {item1, item2};
        Item[] items2 = {item3, item4};
        // 调用测试addOrder()方法
        //OrderService.addOrder(user1, items1);
        OrderService.addOrder(user1, items2);
    }
}
