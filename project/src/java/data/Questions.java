/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author pc
 */
public class Questions {
    int IdQuestions;
    int IdPosts;
    String Question;

    public Questions() {
    }

    public Questions(int IdQuestions, int IdPosts, String Question) {
        this.IdQuestions = IdQuestions;
        this.IdPosts = IdPosts;
        this.Question = Question;
    }

    public int getIdQuestions() {
        return IdQuestions;
    }

    public void setIdQuestions(int IdQuestions) {
        this.IdQuestions = IdQuestions;
    }

    public int getIdPosts() {
        return IdPosts;
    }

    public void setIdPosts(int IdPosts) {
        this.IdPosts = IdPosts;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }
    
    
}
