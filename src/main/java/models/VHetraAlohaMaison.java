package models;

import bean.TypeObjet;

public class VHetraAlohaMaison extends TypeObjet {

    private int idmaison;               // Identifiant de la maison
    private String addresse;            // Adresse de la maison
    private int nombre_etage;           // Nombre d'étages
    private double superficie_m2;       // Superficie totale en m²
    private double superficie_vivable;  // Superficie vivable en m²
    private double hetra;               // Calcul de l'hetra
    private int id_arrondissement;      // Identifiant de l'arrondissement
    private String nom_arrondissement;  // Nom de l'arrondissement

    // Constructeur sans argument
    public VHetraAlohaMaison() {
        super.setNomTable("v_hetra_aloha_maison");
    }

    // Constructeur avec arguments
    public VHetraAlohaMaison(int idmaison, String addresse, int nombre_etage, double superficie_m2,
                             double superficie_vivable, double hetra, int id_arrondissement, String nom_arrondissement) {
        this.idmaison = idmaison;
        this.addresse = addresse;
        this.nombre_etage = nombre_etage;
        this.superficie_m2 = superficie_m2;
        this.superficie_vivable = superficie_vivable;
        this.hetra = hetra;
        this.id_arrondissement = id_arrondissement;
        this.nom_arrondissement = nom_arrondissement;
    }

    // Getters et setters
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

    public double getSuperficie_vivable() {
        return superficie_vivable;
    }

    public void setSuperficie_vivable(double superficie_vivable) {
        this.superficie_vivable = superficie_vivable;
    }

    public double getHetra() {
        return hetra;
    }

    public void setHetra(double hetra) {
        this.hetra = hetra;
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

    // Méthode toString pour affichage
    @Override
    public String toString() {
        return "VHetraAlohaMaison{" +
                "idmaison=" + idmaison +
                ", addresse='" + addresse + '\'' +
                ", nombre_etage=" + nombre_etage +
                ", superficie_m2=" + superficie_m2 +
                ", superficie_vivable=" + superficie_vivable +
                ", hetra=" + hetra +
                ", id_arrondissement=" + id_arrondissement +
                ", nom_arrondissement='" + nom_arrondissement + '\'' +
                '}';
    }
}

