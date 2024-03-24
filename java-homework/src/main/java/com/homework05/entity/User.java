package com.homework05.entity;

public class User {
    private String userid;
    private String username;
    private String[] games;

    public User(String userid, String username, String[] games) {
        this.userid = userid;
        this.username = username;
        this.games = games;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String[] getGames() {
        return games;
    }

    public void setGames(String[] games) {
        this.games = games;
    }

}
