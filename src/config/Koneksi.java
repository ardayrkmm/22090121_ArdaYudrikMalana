/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;



import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author LENOVO
 */
public class Koneksi {
    public static Connection konek() {
        Connection c = null;
        try {
             
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("");
        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("toko_material");
        dataSource.setPortNumber(3306);
        dataSource.setAllowMultiQueries(true);
        dataSource.setServerTimezone("Asia/Jakarta");
        c =dataSource.getConnection();
        return c;
        } catch (SQLException e) {
            System.err.println(e);
        }
          return c;

    }
     
}
