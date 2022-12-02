package fr.lsarribouette.mumblinginlayeredarchitecture.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnexion {
    public static Connection seConnecter() throws SQLException {

        String url = Settings.getPropriete("url");
        String user = Settings.getPropriete("user");
        String pwd = Settings.getPropriete("pwd");

        Connection cnx = DriverManager.getConnection(url,user,pwd);

        return cnx;
    }

    public static void seDeconnecter(Connection cnx) throws SQLException {
        if (cnx != null) cnx.close();
    }
}
