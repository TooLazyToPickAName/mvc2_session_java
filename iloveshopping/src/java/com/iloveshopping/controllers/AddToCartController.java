/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iloveshopping.controllers;

import com.iloveshopping.entities.Cart;
import com.iloveshopping.entities.Category;
import com.iloveshopping.models.CategoryModel;
import com.iloveshopping.models.ProductModel;
import com.katamvc.controllers.Action;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author windluffy
 */
public class AddToCartController extends Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response) {
        try {
            String pid = request.getParameter("pid");
            Cart cart = (Cart) request.getSession().getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
            }
            this.addProduct(Integer.parseInt(pid), cart);
            request.getSession().setAttribute("cart", cart);
        } catch (Exception ex) {

            return "error404.jsp";
        }
        CategoryModel cm = new CategoryModel();
        ArrayList<Category> categories = cm.getAllCategories();
        request.setAttribute("categories", categories);
        return "cart.jsp";
    }

    private void addProduct(int pid, Cart cart) {
        cart.addProduct(new ProductModel().getProductById(pid));
    }

}