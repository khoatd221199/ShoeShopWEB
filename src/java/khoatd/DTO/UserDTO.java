/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khoatd.DTO;

/**
 *
 * @author DANGKHOA
 */
public class UserDTO {
      private String userID;
    private String password;
    private String name;
    private String phone;
    private String address;
   

    public UserDTO() {
    }

    public UserDTO(String userID, String password, String name, String phone, String address) {
        this.userID = userID;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.address = address;
      
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
