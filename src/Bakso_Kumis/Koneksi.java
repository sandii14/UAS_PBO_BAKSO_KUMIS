package Bakso_Kumis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    static Connection koneksi;
    public static Connection getKoneksi(){
        try {
            String url = "jdbc:mysql://localhost/db_bakso";
            String user = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, password);
        }
        catch (SQLException t){
            System.out.println("Error Membuat Koneksi");
        }
        return koneksi;
    }
    
    public static void main (String args[]){
        getKoneksi();
    }
}
