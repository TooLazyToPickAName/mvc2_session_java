/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.katamvc.controllers;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author windluffy
 */
public abstract class Action {

    private int typeRequest;

    

    public Action() {
        typeRequest = 1;
    }

    public int getType() {
        return typeRequest;
    }

    public void setType(int typeRequest) {
        this.typeRequest = typeRequest;
    }

    public abstract String run(HttpServletRequest request, HttpServletResponse response);
}
