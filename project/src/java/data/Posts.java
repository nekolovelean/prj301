/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author pc
 */
public class Posts {
    int IdPost;
    int IdCourse;
    String UserName;

    public Posts() {
    }

    public Posts(int IdPost, int IdCourse, String UserName) {
        this.IdPost = IdPost;
        this.IdCourse = IdCourse;
        this.UserName = UserName;
    }

    public int getIdPost() {
        return IdPost;
    }

    public void setIdPost(int IdPost) {
        this.IdPost = IdPost;
    }

    public int getIdCourse() {
        return IdCourse;
    }

    public void setIdCourse(int IdCourse) {
        this.IdCourse = IdCourse;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    
}
