package com.acat.vo;

import java.io.Serializable;

public class LoginVo implements Serializable {

    private static final long serialVersionUID = 2L;

    private String bishe_register_username;
    private String bishe_register_password;

    public String getBishe_register_username() {
        return bishe_register_username;
    }

    public void setBishe_register_username(String bishe_register_username) {
        this.bishe_register_username = bishe_register_username;
    }

    public String getBishe_register_password() {
        return bishe_register_password;
    }

    public void setBishe_register_password(String bishe_register_password) {
        this.bishe_register_password = bishe_register_password;
    }

    @Override
    public String toString() {
        return "LoginVo{" +
                "bishe_register_username='" + bishe_register_username + '\'' +
                ", bishe_register_password='" + bishe_register_password + '\'' +
                '}';
    }
}
