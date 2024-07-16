/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Date;

/**
 *
 * @author pc
 */
public class account {

    String user;
    String password;
    int IdCampus;
    int IdPosition;
    Date date;
    String sex;
    String fullname;
    String email;

    public account() {
    }

    public account(String user, String password, int IdCampus, int IdPosition, Date date, String sex, String fullname, String email) {
        this.user = user;
        this.password = password;
        this.IdCampus = IdCampus;
        this.IdPosition = IdPosition;
        this.date = date;
        this.sex = sex;
        this.fullname = fullname;
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdCampus() {
        return IdCampus;
    }

    public void setIdCampus(int IdCampus) {
        this.IdCampus = IdCampus;
    }

    public int getIdPosition() {
        return IdPosition;
    }

    public void setIdPosition(int IdPosition) {
        this.IdPosition = IdPosition;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

}
