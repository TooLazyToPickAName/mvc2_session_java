/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iloveshopping.controllers;

import com.katamvc.controllers.Action;
import com.katamvc.controllers.RedirectType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author windluffy
 */
public class LogoutController extends Action{

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().setAttribute("username", null);
        request.getSession().setAttribute("role", null);
        setType(RedirectType.REDIRECT);
        return "index.jsp";
    }
    
}
