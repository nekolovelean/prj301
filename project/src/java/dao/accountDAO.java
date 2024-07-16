/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author pc
 */
public class accountDAO extends DBContext {

    public boolean insert(String username, String password, int IdCampus,int IdPosition, Date Date,String Sex, String FullName, String email)
            throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        //2. Create SQL String
        String sql = "INSERT [dbo].[Account] ([UserName], [Password], [IdCampus], [IdPosition], [Date], [Sex], [FullName], [Email])"
                + "VALUES(?,?,?,?,?,?,?,?)";
        //3. Create Statement
        stm = con.prepareStatement(sql);
        stm.setString(1, username);
        stm.setString(2, password);
        stm.setInt(3, IdCampus);
        stm.setInt(4, IdPosition);
        stm.setDate(5, (java.sql.Date) Date);
        stm.setString(6,Sex);
        stm.setString(7, FullName);
        stm.setString(5, email);
        //4. Excute Query
        int row = stm.executeUpdate();
        if (row > 0) {
            return true;
        }
        return false;
    }
    
    

    public boolean checkLogin(String username, String password)
            throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "Select user "
                + "FROM account "
                + "WHERE user = ? "
                + "AND password = ?";
        //3. Create Statement
        stm = con.prepareStatement(sql);
        stm.setString(1, username);
        stm.setString(2, password);
        //4. Excute Query
        rs = stm.executeQuery();
        //5. Process Result
        if (rs.next()) {
            return true;
        }
        return false;
    }
}
