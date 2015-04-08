/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useJavaBean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shine
 */
public class ShoppingCart {
    private final List<String> products = new ArrayList<String>();

    
    public void setProduct(String product){
        products.add(product);
    }
    public List<String> getProducts() {
        return products;
    }
}
