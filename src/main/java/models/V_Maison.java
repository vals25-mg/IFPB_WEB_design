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
public class V_Maison extends TypeObjet {

    int idmaison;
    int nombre_etage;
    double superficie_m2;
    String addresse;
    int id_arrondissement;
    String nom_arrondissement;
    double superficie_vivable;
    double longueur;
    double largeur;

    public V_Maison() {
        super.setNomTable("v_maison");
    }

    public int getIdmaison() {
        return idmaison;
    }

    public void setIdmaison(int id_maison) {
        this.idmaison = id_maison;
    }

    public int getNombre_etage() {
        return nombre_etage;
    }

    public void setNombre_etage(int nombre_etage) {
        this.nombre_etage = nombre_etage;
    }

    public double getSuperficie_m2() {
        return superficie_m2;
    }

    public void setSuperficie_m2(double superficie_m2) {
        this.superficie_m2 = superficie_m2;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public int getId_arrondissement() {
        return id_arrondissement;
    }

    public void setId_arrondissement(int id_arrondissement) {
        this.id_arrondissement = id_arrondissement;
    }

    public String getNom_arrondissement() {
        return nom_arrondissement;
    }

    public void setNom_arrondissement(String nom_arrondissement) {
        this.nom_arrondissement = nom_arrondissement;
    }

    public double getSuperficie_vivable() {
        return superficie_vivable;
    }

    public void setSuperficie_vivable(double superficie_vivable) {
        this.superficie_vivable = superficie_vivable;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
}
