/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iloveshopping.models;

import com.iloveshopping.entities.Category;
import com.iloveshopping.entities.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author windzero
 */
public class CategoryModel {
    private Connection conn;

    public CategoryModel() {
        Database db = new Database();
        conn = db.getConnection();
    }
    
    public ArrayList<Category> getAllCategories() {
        ArrayList<Category> result = new ArrayList<>();
        String query = "Select * from Category";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
               Category c = new Category();
               c.setId(rs.getInt("ID"));
               c.setName(rs.getString("Name"));
               c.setDescription(rs.getString("Description"));
               result.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
        
    }
    
    public LinkedList<Product> getProductsByCategoryId(int cid) {
        LinkedList<Product> result = new LinkedList<>();
        String query = "select * from Product where CategoryID = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, cid);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("ID"));
                p.setName(rs.getString("Name"));
                p.setPrice(rs.getFloat("Price"));
                p.setEnergy(rs.getFloat("Energy"));
                p.setImg(rs.getString("Img"));
                p.setCategoryId(rs.getInt("CategoryID"));
                p.setDescription(rs.getString("Description"));
                result.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
