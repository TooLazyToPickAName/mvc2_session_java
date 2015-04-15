/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iloveshopping.controllers;

import com.iloveshopping.entities.Category;
import com.iloveshopping.entities.Product;
import com.iloveshopping.models.CategoryModel;
import com.iloveshopping.models.ProductModel;
import com.iloveshopping.models.UserModel;
import com.katamvc.controllers.Action;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author windluffy
 */
public class HomeController extends Action {

    int pageSize = 6;

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response) {
        ProductModel pm = new ProductModel();
        String numberPage = request.getParameter("numberPage");
        if (numberPage != null) {
            int beginRow = (Integer.parseInt(numberPage) - 1) * (pageSize);
            beginRow = (beginRow == -1) ? 0 : beginRow;
            ArrayList<Product> products = pm.getListProduct(beginRow, pageSize);
            request.setAttribute("products", products);
        } else {

            ArrayList<Product> products = pm.getListProduct(0, pageSize);
            request.setAttribute("products", products);
        }
        int totalProducts = pm.countAllProducts();
        request.setAttribute("totalPages", totalProducts/pageSize+1);

        CategoryModel cm = new CategoryModel();
        ArrayList<Category> categories = cm.getAllCategories();
        request.setAttribute("categories", categories);

        //request.getSession().setAttribute("users", um.getAllUsers());
        return "home.jsp";
    }

}
