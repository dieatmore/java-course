package com.homework05.test;

import com.homework05.entity.Game;
import com.homework05.entity.Role;
import com.homework05.entity.User;

public class Test {

    public static void main(String[] args) {
        //创建两个角色
        Role role1 = new Role("1", false, "di");
        Role role2 = new Role("2", true, "zhao");
        //创建两个游戏
        Game game1 = new Game("1", "魂斗罗", "枪战闯关");
        Game game2 = new Game("2", "超级马里奥", "跑酷闯关");
        //创建一个用户
        String[] s = {"魂斗罗", "超级马里奥"};
        User user = createUser("1", "Mike", s);
        listGames(user);
    }

    public static User createUser(String userid, String username, String[] games) {
        var user = new User(userid, username, games);
        return user;
    }

    public static void listGames(User user) {
        System.out.println(user.getGames());
    }
}


