package com.homework05.entity;

public class Role {
    private String roleid;
    private boolean vip;
    private String rolename;

    public Role(String roleid, boolean vip, String rolename) {
        this.roleid = roleid;
        this.vip = vip;
        this.rolename = rolename;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getRoleid() {
        return roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
