/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iloveshopping.controllers;

import com.iloveshopping.models.UserModel;
import com.katamvc.controllers.Action;
import com.katamvc.controllers.RedirectType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 *
 * @author windluffy
 */
public class LoginController extends Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        doLogin(request.getParameter("txtUsername"), request.getParameter("txtPassword"), session);
        setType(RedirectType.REDIRECT);
        return "index.jsp";
    }

    public void doLogin(String username, String password, HttpSession session) {
        UserModel um = new UserModel();
        int result = um.checkLogin(username, password);
        if (result != -1) {
            session.setAttribute("username", username);
            session.setAttribute("role", result);
        } else {
            session.setAttribute("username", null);
        }
    }

}
