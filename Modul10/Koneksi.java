package Modul10;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Koneksi {

    private static Connection mysqlkonek;

    public static void main(String[] args)
            throws SQLException {
        koneksiDB();
    }

    public static Connection koneksiDB() throws SQLException {
        if (mysqlkonek == null) {
            try {
                String DB = "jdbc:mysql://localhost:3306/kevin_19650109";
                String user = "root";
                String pass = "";
                Class.forName("com.mysql.jdb.Driver");
                mysqlkonek = (Connection) DriverManager.getConnection(DB, user, pass);
                JOptionPane.showMessageDialog(null, "koneksi sukses");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "koneksi gagal");
            }
        }
        return mysqlkonek;
    }
}
