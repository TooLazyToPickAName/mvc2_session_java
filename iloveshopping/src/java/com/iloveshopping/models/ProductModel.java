/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iloveshopping.models;

import com.iloveshopping.entities.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author windluffy
 */
public class ProductModel {

    Connection conn = null;
    Database db = null;

    public ProductModel() {
        db = new Database();
        conn = db.getConnection();
    }

    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> result = new ArrayList<>();
        String query = "Select * from Product";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
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
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public Product getProductById(int id) {
        Product product = null;
        String query = "Select * from Product where ID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                product = new Product();
                product.setId(rs.getInt("ID"));
                product.setName(rs.getString("Name"));
                product.setImg(rs.getString("Img"));
                product.setEnergy(rs.getFloat("Energy"));
                product.setPrice(rs.getFloat("Price"));
                product.setDescription(rs.getString("Description"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
        
    }
    
    public ArrayList<Product> getListProduct(int beginRow, int pageSize) {
        ArrayList<Product> result = new ArrayList<>();
        String query = "select * from Product limit ?,?";
     
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, beginRow);
            ps.setInt(2, pageSize);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
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
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
    
    public int countAllProducts() {
        String query = "Select Id from Product";
        int count = 0;
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while(rs.next()) {
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return count;
    }

    public ArrayList<Product> searchProductByName(String keyword) {
        ArrayList<Product> result = new ArrayList<>();
        String query = "select * from Product where Name like ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%"+keyword+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
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
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public static void main(String[] args) {
        ProductModel pm = new ProductModel();
        pm.getListProduct(0, 4).stream().forEach((p) -> {
            System.out.println(p.getName());
        });
    }
}
