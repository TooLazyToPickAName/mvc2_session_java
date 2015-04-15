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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author windluffy
 */
public class DetailProductController extends Action{

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response) {
        String pid = request.getParameter("pid");
        request.setAttribute("pid_ok", pid);
        
        ProductModel pm = new ProductModel();
       Product product = pm.getProductById(Integer.parseInt(pid));
        request.setAttribute("product", product);
        
        CategoryModel cm = new CategoryModel();
        ArrayList<Category> categories = cm.getAllCategories();
        request.setAttribute("categories", categories);
        
        return "detail_product.jsp";
    }
    
}
