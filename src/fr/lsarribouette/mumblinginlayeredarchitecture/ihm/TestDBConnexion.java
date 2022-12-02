package fr.lsarribouette.mumblinginlayeredarchitecture.ihm;

import fr.lsarribouette.mumblinginlayeredarchitecture.dal.DBConnexion;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDBConnexion {
    public static void main(String[] args) {

    /* Il faut charger le module java.sql car il n'est pas charge par defaut :
        alt+enter > "add to module compiler"
     */

        Connection cnx = null;
        try {
            cnx = DBConnexion.seConnecter();
            System.out.println("Etat de la connexion : ");
            System.out.println(cnx.isClosed()?"fermée":"ouverte");
        } catch (SQLException e) {
            System.out.println("Une erreur est survenue lors la connexion à la base de données.");
        } finally {
            try {
                DBConnexion.seDeconnecter(cnx);
                System.out.println("Etat de la connexion après déconnexion : ");
                System.out.println(cnx.isClosed()?"fermée":"ouverte");
            } catch (SQLException e) {
                System.out.println("Une erreur est survenue lors la déconnexion à la base de données.");
            }
        }

        // option sans externalisation de la connection
        /*
        String url = "jdbc:postgresql://localhost:5433/gestion_cours";
        String user = "postgres";
        String pwd = "postgres";
        Connection cnx = null;
        try {
            cnx = DriverManager.getConnection(url,user,pwd);
            System.out.println("Etat de la connexion : ");
            System.out.println(cnx.isClosed()?"fermée":"ouverte");
        } catch (SQLException e) {
            System.out.println("Une erreur est survenue lors la connexion à la base de données.");
        } finally {
            try {
                cnx.close();
                System.out.println("Etat de la connexion après déconnexion : ");
                System.out.println(cnx.isClosed() ? "fermée" : "ouverte");
            } catch (SQLException e) {
                System.out.println("Une erreur est survenue lors la déconnexion à la base de données.");
            }
        }
        */
    }
}
