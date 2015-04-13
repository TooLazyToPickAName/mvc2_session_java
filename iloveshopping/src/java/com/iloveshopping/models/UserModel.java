/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iloveshopping.models;

import com.iloveshopping.entities.User;
import com.iloveshopping.models.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author windluffy
 */
public class UserModel {
    Connection conn = null;   
    public UserModel() {
        Database db = new Database();
        conn = db.getConnection();
    }
    
    /**
     * 
     * @param username
     * @param password
     * @return role of user. -1 if login fail, 0 is admin, 1 is member
     */
    public int checkLogin(String username, String password) {
        try {
            String query = "Select * from User where username = ? and password = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            String role = null;
            while(rs.next()) {
                role = rs.getString("RoleID");
            }
            if(role != null) {
                return Integer.parseInt(role);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public ArrayList<User> getAllUsers() {
        ArrayList<User> result = new ArrayList<>();
        String query = "Select * from User";
         
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                User u = new User();
                u.setId(rs.getInt("ID"));
                u.setUsername(rs.getString("Username"));
                
                result.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;  
    }
    
    public static void main(String[] args) {
        
        UserModel muser = new UserModel();
        System.out.println(muser.checkLogin("member", "123456"));
    }
}
