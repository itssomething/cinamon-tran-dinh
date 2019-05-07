/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.purchase_system.Order;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manh
 */
public class OrderDao extends DB {

  public static OrderDao instance;

  public synchronized static OrderDao getInstance() {
    if (instance == null) {
      instance = new OrderDao();
    }
    return instance;
  }

  
  public boolean save(Order order) {
    boolean isThanhCong = false;
    Connection conn = DB.getConnection();
    Statement comm = null;
    try {
      String query2 = String.format("INSERT INTO order(status) VALUES('%s')","received");
      comm = conn.createStatement();
      isThanhCong = comm.executeUpdate(query2) > 0;
    } catch (SQLException ex) {
      System.out.println("Chi tiết lỗi: " + ex.getMessage());
    } finally {
      try {
        conn.close();
         comm.close();
      } catch (SQLException ex) {
      }
     
    }
    return isThanhCong;
  }

  
}
