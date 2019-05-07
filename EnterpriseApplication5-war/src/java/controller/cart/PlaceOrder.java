/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.cart;

import dao.OrderDao;
import entities.customer.Customer;
import entities.purchase_system.CartProduct;
import entities.purchase_system.Order;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessionbean.customer.CustomerFacadeLocal;
import sessionbean.purchase_system.CartProductFacadeLocal;
import sessionbean.purchase_system.OrderFacadeLocal;

/**
 *
 * @author Manh
 */
@WebServlet(name = "PlaceOrder", urlPatterns = {"/PlaceOrder"})
public class PlaceOrder extends HttpServlet {
    private static final long serialVersionUID = 1L;
//    @EJB
//    OrderFacadeLocal ofl;
//    
//    @EJB
//    CustomerFacadeLocal cfl;
//    
//    @EJB
//    CartProductFacadeLocal cpfl;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//      OrderDao od = new OrderDao();
//        Order order = new Order();
//      
//        order.setStatus(1);
////        ofl.createWithStatus("received");
////        ofl.create(order);
//       boolean isTC= od.save(order);
//      System.out.println(isTC+"boooo");
//        HttpSession session = request.getSession();
//        String username = (String) session.getAttribute("username");
//        Customer customer = cfl.findByUsername(username);
//        int customerID = customer.getCustomerID();

//        List<CartProduct> cartProducts = cpfl.findByStatusAndCustomerID(0, customerID);
//        for(CartProduct cp : cartProducts){
//            cp.setStatus(1);
//            cp.setOrderOrderID(order.getOrderID());
//            cpfl.edit(cp);
//        }
        OrderDao od = new OrderDao();
        Order order = new Order();
      
  //      order.setStatus(1);
//        ofl.createWithStatus("received");
//        ofl.create(order);
        boolean isTC= od.save(order);
        if(isTC){
           request.getRequestDispatcher("/WEB-INF/views/cart/payment.jsp").forward(request, response);
        }else{
           request.getRequestDispatcher("/WEB-INF/views/test.jsp").forward(request, response);
        }
        System.out.println(isTC+"boooo");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        OrderDao od = new OrderDao();
//        Order order = new Order();
//      
//  //      order.setStatus(1);
////        ofl.createWithStatus("received");
////        ofl.create(order);
//        boolean isTC= od.save(order);
//        if(isTC){
//           request.getRequestDispatcher("/WEB-INF/views/cart/payment.jsp").forward(request, response);
//        }else{
//           request.getRequestDispatcher("/WEB-INF/views/test.jsp").forward(request, response);
//        }
//        System.out.println(isTC+"boooo");
//        HttpSession session = request.getSession();
//        String username = (String) session.getAttribute("username");
//        Customer customer = cfl.findByUsername(username);
//        int customerID = customer.getCustomerID();
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
