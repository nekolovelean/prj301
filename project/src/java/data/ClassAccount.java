/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author pc
 */
public class ClassAccount {
    int IdClass;
    String UserName;

    public ClassAccount() {
    }

    public ClassAccount(int IdClass, String UserName) {
        this.IdClass = IdClass;
        this.UserName = UserName;
    }

    public int getIdClass() {
        return IdClass;
    }

    public void setIdClass(int IdClass) {
        this.IdClass = IdClass;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    
}
