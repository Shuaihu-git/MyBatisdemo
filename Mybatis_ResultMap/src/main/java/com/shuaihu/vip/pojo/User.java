package com.shuaihu.vip.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class User {
    private String user_name;
    private String user_passwd;
    private Date birthday;
    private String sex;
    private String telephone;
    private String wechat;

    private Integer id;

    public User(String user_name, String user_passwd, Date birthday, String sex, String telephone, String wechat, Integer id) {
        this.user_name = user_name;
        this.user_passwd = user_passwd;
        this.birthday = birthday;
        this.sex = sex;
        this.telephone = telephone;
        this.wechat = wechat;
        this.id = id;
    }

    public User(String user_name, String user_passwd, Date birthday, String sex, String telephone, String wechat) {
        this.user_name = user_name;
        this.user_passwd = user_passwd;
        this.birthday = birthday;
        this.sex = sex;
        this.telephone = telephone;
        this.wechat = wechat;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_passwd() {
        return user_passwd;
    }

    public void setUser_passwd(String user_passwd) {
        this.user_passwd = user_passwd;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Override
    public String toString() {
        return "user_name="+user_name+"user_passwd="+user_passwd+"birthday="+new SimpleDateFormat("yyyy-MM-dd").format(getBirthday())+"sex="+sex+"telephone="+
                telephone+"wechat="+wechat+"id="+id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
