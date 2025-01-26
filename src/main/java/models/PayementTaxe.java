package models;

import bean.TypeObjet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PayementTaxe extends TypeObjet {

    private int id_payement_taxe; // Clé primaire
    private int id_maison;       // Référence à la table "maison"
    private double montant;      // Montant de la taxe
    private int mois;            // Mois du paiement
    private int annee;           // Année du paiement

    // Constructeur sans argument
    public PayementTaxe() {
        super.setNomTable("payement_taxe");
    }

    // Constructeur avec arguments
    public PayementTaxe(int id_payement_taxe, int id_maison, double montant, int mois, int annee) {
        this.id_payement_taxe = id_payement_taxe;
        this.id_maison = id_maison;
        this.montant = montant;
        this.mois = mois;
        this.annee = annee;
    }

    // Getters et setters
    public int getId_payement_taxe() {
        return id_payement_taxe;
    }

    public void setId_payement_taxe(int id_payement_taxe) {
        this.id_payement_taxe = id_payement_taxe;
    }

    public int getId_maison() {
        return id_maison;
    }

    public void setId_maison(int id_maison) {
        this.id_maison = id_maison;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // Méthode toString pour affichage
    @Override
    public String toString() {
        return "PayementTaxe{" +
                "id_payement_taxe=" + id_payement_taxe +
                ", id_maison=" + id_maison +
                ", montant=" + montant +
                ", mois=" + mois +
                ", annee=" + annee +
                '}';
    }

    public void insertPayementTaxe(int idmaison, double montant, int mois, int annee, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = null;

        try {
            // Étape 2 : Préparer la requête SQL
            String sql = "INSERT INTO payement_taxe (id_maison, montant, mois, annee) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            // Étape 3 : Remplir les valeurs des paramètres
            preparedStatement.setInt(1, idmaison);  // Premier ?
            preparedStatement.setDouble(2, montant); // Deuxième ?
            preparedStatement.setInt(3, mois);      // Troisième ?
            preparedStatement.setInt(4, annee);     // Quatrième ?

            // Étape 4 : Exécuter la requête
            int rowsInserted = preparedStatement.executeUpdate();

            // Vérification si l'insertion a réussi
            if (rowsInserted > 0) {
                System.out.println("PayementTaxe inséré avec succès !");
            } else {
                System.out.println("Échec de l'insertion du PayementTaxe.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Propager l'exception pour la gestion au niveau supérieur
        } finally {
            // Étape 5 : Fermer les ressources
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
}

