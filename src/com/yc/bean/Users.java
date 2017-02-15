package com.yc.bean;

public class Users {
    private int usid;
    private String uname;
    private String upwd;
    
    
    public Users() {
        super();
        // TODO 自动生成的构造函数存根
    }
    public Users(int usid) {
        super();
        this.usid = usid;
    }
    
    public Users(int usid, String uname, String upwd) {
        super();
        this.usid = usid;
        this.uname = uname;
        this.upwd = upwd;
    }
    public int getUsid() {
        return usid;
    }
    public void setUsid(int usid) {
        this.usid = usid;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getUpwd() {
        return upwd;
    }
    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
    @Override
    public String toString() {
        return "Users [usid=" + usid + ", uname=" + uname + ", upwd=" + upwd + "]";
    }
}
