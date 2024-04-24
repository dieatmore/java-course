package com.homework06.one;

import com.homework06.one.entity.User;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        User user1 = new User(1, "王思迪", "大连");
        User user2 = new User(2, "赵天瑜", "哈尔滨");
        User user3 = new User(3, "张修涵", "大连");
        User user4 = new User(4, "代玉柔", "新疆");
        User user5 = new User(5, "王鑫", "哈尔滨");
        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    //创建静态方法，传入封装User类型元素的Set集合，转为List集合返回。
    public static List<User> changeList(Set<User> users) {
        List<User> users1 = new ArrayList<>(users);
        return users1;
    }

    //创建静态方法，传入封装User类型元素的Set集合，以及用户ID，基于迭代器，在集合移除指定ID用户
    public static void removeUser(Set<User> users, int id) {
        Iterator<User> iUsers = users.iterator();
        while (iUsers.hasNext()) {
            User u = iUsers.next();
            if (u.getId() == id) {
                iUsers.remove();
            }
        }
    }

    //创建静态方法，传入封装User类型元素的Set集合，将集合中元素，以城市名称为键，相同城市用户集合为值，分组传入测试集合，调用测试
    public static void cityMap(Set<User> users) {
        List<User> users1 = new ArrayList<>(users);
        Map<String, List<User>> userMap = users1
                .stream()
                .collect(Collectors.groupingBy(User::getCity));
    }
}
