/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iloveshopping.controllers;

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
public class SearchProductController extends Action{

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response) {
        ProductModel pm = new ProductModel();
        request.setAttribute("products", pm.searchProductByName(request.getParameter("txtSearch")));
        
        CategoryModel cm = new CategoryModel();
        ArrayList<Category> categories = cm.getAllCategories();
        request.setAttribute("categories", categories);
        return "search.jsp";
    }
    
}
