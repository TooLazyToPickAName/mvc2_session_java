/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iloveshopping.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Cart {

    List<Product> products;
    
    public Cart() {
        products = new ArrayList<>();
    }
    
    public void addProduct(Product p) {
        if(products.contains(p)) {
            products.get(products.indexOf(p)).setQuanity(products.get(products.indexOf(p)).getQuanity()+1);
        } else {
            products.add(p);
        }
        
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
}
