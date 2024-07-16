/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author pc
 */
public class Comments {
    int IdComments;
    int IdQuestions;
    String Comments;
    String UserName;

    public Comments() {
    }

    public Comments(int IdComments, int IdQuestions, String Comments, String UserName) {
        this.IdComments = IdComments;
        this.IdQuestions = IdQuestions;
        this.Comments = Comments;
        this.UserName = UserName;
    }

    public int getIdComments() {
        return IdComments;
    }

    public void setIdComments(int IdComments) {
        this.IdComments = IdComments;
    }

    public int getIdQuestions() {
        return IdQuestions;
    }

    public void setIdQuestions(int IdQuestions) {
        this.IdQuestions = IdQuestions;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    
}
