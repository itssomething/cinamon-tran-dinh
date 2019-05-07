/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Manh
 */
public class DB {

private static final String JDBC_DRIVER
          = "com.mysql.cj.jdbc.Driver";
  private static final String DATABASE_PATH
          = "jdbc:mysql//localhost:3306/bank_system";

  public static Connection getConnection() {
    Connection conn = null;
    try {
      Class.forName(JDBC_DRIVER);
      conn = (Connection) DriverManager.getConnection(DATABASE_PATH,
              "root", "123456");
    } catch (ClassNotFoundException | SQLException ex) {
      System.out.println("Lỗi khi kết nối DB: "
              + ex.toString());
    }
    return conn;
  }
}
