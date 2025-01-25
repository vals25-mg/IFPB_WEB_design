/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import bean.*;
/**
 *
 * @author valisoa
 */
public class HetraMaisonAnnee extends Hetra {
    
    int idmaison;
    String addresse;

    public HetraMaisonAnnee() {
        super.setNomTable("v_hetra_maison_voaloha_annee");
    }

    
    public int getIdmaison() {
        return idmaison;
    }

    public void setIdmaison(int idmaison) {
        this.idmaison = idmaison;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
    
    
}
