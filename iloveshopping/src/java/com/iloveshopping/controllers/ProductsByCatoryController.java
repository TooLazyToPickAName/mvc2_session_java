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
import com.katamvc.controllers.Action;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author windluffy
 */
public class ProductsByCatoryController extends Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response) {

        CategoryModel cm = new CategoryModel();
        int cid = 1;
        if(request.getParameter("cid") != null) {
            cid = Integer.parseInt(request.getParameter("cid"));
        }
        LinkedList<Product> products = cm.getProductsByCategoryId(cid);
        request.setAttribute("products", products);

        ArrayList<Category> categories = cm.getAllCategories();
        request.setAttribute("categories", categories);
        return "category.jsp";
    }

}
