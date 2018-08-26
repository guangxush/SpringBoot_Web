package com.shgx.sys.Entity;

import org.springframework.stereotype.Component;

/**
 * Created by gshan on 2018/8/25
 */
@Component
public class User {
    private String id;
    private String userId;
    private String pwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
