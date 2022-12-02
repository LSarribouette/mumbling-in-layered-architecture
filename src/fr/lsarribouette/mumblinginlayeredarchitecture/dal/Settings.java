package fr.lsarribouette.mumblinginlayeredarchitecture.dal;

import java.io.IOException;
import java.util.Properties;

public class Settings {
    private static Properties proprietes;

    // methode anonyme : lors de l'appel de la classe, ce bloc est execute en premier
    static {
        try {
            proprietes = new Properties();
            proprietes.load(Settings.class.getResourceAsStream("connexion.properties"));
        } catch (IOException e) {
            System.out.println("Une erreur est survenue lors de chargement du ficher connexion.properties.");
        }
    }

    // methode qui retourne une information de connexion
    public static String getPropriete(String cle) {
        return proprietes.getProperty(cle);
    }
}
