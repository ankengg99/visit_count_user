package com.example.Hit.module;

public class Hit {

private String user="user";
private int count=0;

    public Hit() {
    }

    public Hit(String user, int count) {
        this.user = user;
        this.count = count;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String toString(){
        return "{"+"username : "+this.user+", \n"+
                "count : "+this.count+"\n"+
                "}";
    }
}
