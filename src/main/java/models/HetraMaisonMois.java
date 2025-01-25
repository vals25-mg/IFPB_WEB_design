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
public class HetraMaisonMois extends Hetra {

    int idmaison;
    String addresse;
    int mois;
    String nom_mois;

    public HetraMaisonMois() {
        super.setNomTable("v_hetra_maison_voaloha_mois");
    }

    public int getIdmaison() {
        return idmaison;
    }

    public void setIdmaison(int idmaison) {
        this.idmaison = idmaison;
    }

    public String getAddresse() {
        return 
                addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public String getNom_mois() {
        return nom_mois;
    }

    public void setNom_mois(String nom_mois) {
        this.nom_mois = nom_mois;
    }
    
    
}
