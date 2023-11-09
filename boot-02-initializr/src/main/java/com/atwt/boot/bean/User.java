package com.atwt.boot.bean;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.bean
 * @Author: wutao
 * @CreateTime: 2023-06-16  17:55
 * @Description: TODO
 * @Version: 1.0
 */
public class User {
    private  int uid;
    private String uname;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", ustatus=" + ustatus +
                '}';
    }

    public User(int uid, String uname, String ustatus) {
        this.uid = uid;
        this.uname = uname;
        this.ustatus = ustatus;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    private String ustatus;

    public User() {
    }


}
