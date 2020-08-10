/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modify;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class KetNoi {
    public Connection con;

    public void ketnoi1() throws ClassNotFoundException, SQLException {
        String hosting = "jdbc:sqlserver://localhost\\DESKTOP-81VHF3A\\SQLEXPRESS:1433;databaseName=QL_BDS";
        String username = "sa";
        String password = "12345";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(hosting, username, password);
    }

    public void ketnoi2() throws ClassNotFoundException, SQLException {
        String hosting = "jdbc:sqlserver://localhost\\DESKTOP-DAR31D1\\SQLEXPRESS:1433;databaseName=QL_BDS";
        String username = "sa";
        String password = "19216811";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(hosting, username, password);
    }

    public void ketnoi3() throws ClassNotFoundException, SQLException {
        String hosting = "jdbc:sqlserver://localhost\\AdminPC\\sqlexpress:1433;databaseName=QL_BDS";
        String username = "sa";
        String password = "thang3012";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(hosting, username, password);
    }

    public void ketnoi() {
        try {
            System.out.println("Xin Cho...");
            ketnoi1();
            System.out.println("Da ket noi");
        } catch (Exception e) {
            try {
                System.out.println("Xin Cho...");
                ketnoi2();
                System.out.println("Da ket noi");
            } catch (Exception ex) {
                try {
                    System.out.println("Xin Cho...");
                    ketnoi3();
                    System.out.println("Da ket noi");
                } catch (Exception exc) {
                    System.out.println("Khong The Ket Noi");
                    System.out.println("Da ket noi");
                }
            }
        }
    }
}
