/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author pc
 */
public class Course {
    int IdCourse;
    String NameCourse;

    public Course() {
    }

    public Course(int IdCourse, String NameCourse) {
        this.IdCourse = IdCourse;
        this.NameCourse = NameCourse;
    }

    public int getIdCourse() {
        return IdCourse;
    }

    public void setIdCourse(int IdCourse) {
        this.IdCourse = IdCourse;
    }

    public String getNameCourse() {
        return NameCourse;
    }

    public void setNameCourse(String NameCourse) {
        this.NameCourse = NameCourse;
    }
    
    
}
