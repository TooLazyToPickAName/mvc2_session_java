/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.helper;

import com.model.LoginBean;
import javax.servlet.http.HttpSession;

/**
 *
 * @author phongtq <phongtq at vnext.vn>
 */
public class AuthHelper {
        public static boolean isAuthenticated(HttpSession session){
        LoginBean bean = (LoginBean) session.getAttribute("loginBean");
        return bean != null;
    }
}
