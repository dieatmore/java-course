package com.homework05.entity;

public class Game {
    private String gameid;
    private String gamename;
    private String describe;

    public Game(String gameid, String gamename, String describe) {
        this.gameid = gameid;
        this.gamename = gamename;
        this.describe = describe;
    }

    public String getGameid(){
        return gameid;
    }

    public String getGamename(){
        return gamename;
    }

    public String getDescribe(){
        return describe;
    }

    public void setGameid(String gameid){
        this.gameid = gameid;
    }

    public void setGamename(String gamename){
        this.gamename = gamename;
    }

    public void setDescribe(String describe){
        this.describe = describe;
    }

}


