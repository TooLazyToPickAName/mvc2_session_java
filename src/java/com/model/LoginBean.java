/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author phongtq <phongtq at vnext.vn>
 */
public class LoginBean {

    private String username, password;

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validate() {
        if(this.username.equals("admin") && this.password.equals("admin")) {
            return true;
        }
        return false;

    }
}
