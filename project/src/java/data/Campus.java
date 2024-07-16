/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author pc
 */
public class Campus {
    int IdCampus;
    String NameCampus;

    public Campus() {
    }

    public Campus(int IdCampus, String NameCampus) {
        this.IdCampus = IdCampus;
        this.NameCampus = NameCampus;
    }

    public int getIdCampus() {
        return IdCampus;
    }

    public void setIdCampus(int IdCampus) {
        this.IdCampus = IdCampus;
    }

    public String getNameCampus() {
        return NameCampus;
    }

    public void setNameCampus(String NameCampus) {
        this.NameCampus = NameCampus;
    }
    
    
}
