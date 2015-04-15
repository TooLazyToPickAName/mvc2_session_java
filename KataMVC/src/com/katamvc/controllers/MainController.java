/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.katamvc.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author windluffy
 */
public class MainController extends HttpServlet {

    String error;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri = request.getRequestURI();
        String actionName = getActionName(uri);
        
        Action action = this.getAction(actionName);
        if (action != null) {
            String result = action.run(request, response);
            if(action.getType() == RedirectType.DISPATCHER) {
                request.getRequestDispatcher(result).forward(request, response);
            }else{
                response.sendRedirect(result);
            }
            
        } else {
            request.getRequestDispatcher(error).forward(request, response);
        }

    }

    private String getActionName(String str) {
        String result = null;
        try {
            result = str.substring(str.lastIndexOf("/") + 1, str.lastIndexOf(".action"));
        } catch (Exception ex) {

        }
        return result;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private Action getAction(String actionName) {
        String className = this.getInitParameter(actionName);
        
        Action action = null;
        try {
            Class c = Class.forName(className);
            action = (Action) c.newInstance();
        } catch (Exception ex) {
            error = "error404.jsp";
        }
        return action;
    }
}
