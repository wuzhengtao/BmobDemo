package com.easywork.data;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2017/4/24.
 */

public class User extends BmobObject {
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
}
