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
public class Hetra extends ClassMAPTable {
    int id_arrondissement;
    String nom_arrondissement;
    int annee;
    double hetra_aloha;
    double hetra_voaloha;
    double reste;

    public Hetra() {
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

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public double getHetra_aloha() {
        return hetra_aloha;
    }

    public void setHetra_aloha(double hetra_aloha) {
        this.hetra_aloha = hetra_aloha;
    }

    public double getHetra_voaloha() {
        return hetra_voaloha;
    }

    public void setHetra_voaloha(double hetra_voaloha) {
        this.hetra_voaloha = hetra_voaloha;
    }

    public double getReste() {
        return reste;
    }

    public void setReste(double reste) {
        this.reste = reste;
    }

    @Override
    public String getTuppleID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getAttributIDName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
