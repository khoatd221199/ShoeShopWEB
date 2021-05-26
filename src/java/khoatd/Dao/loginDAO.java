/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khoatd.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import khoatd.DTO.UserDTO;
import khoatd.Utils.DBUtils;

/**
 *
 * @author DANGKHOA
 */
public class loginDAO {
    
     private Connection con;
    private PreparedStatement stm;
    private ResultSet rs;

    private void closeConnection() throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (con != null) {
            con.close();
        }
    }

    public UserDTO checkLogin(String userID, String password) throws Exception {
        UserDTO user = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "select NameCus, PhoneCus, AddressCus from AccountUser  where UsernameCus=? AND PasswordCus=?";
                stm = con.prepareStatement(sql);
                stm.setString(1, userID);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    String name = rs.getString("NameCus");
                    String phone = rs.getString("PhoneCus");
                    String address = rs.getString("AddressCus");
                  
                    user = new UserDTO(userID, "", name, phone, address);
                }
            }
        } finally {
            closeConnection();
        }
        return user;
    }

}
