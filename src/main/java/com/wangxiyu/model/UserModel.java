package com.wangxiyu.model;

/**
 * Created by Administrator on 2018/5/4 0004.
 */
public class UserModel {
    public boolean login(String userName,String password) {

        return userName.equals("John") &&password.equals("123");
    }
}
