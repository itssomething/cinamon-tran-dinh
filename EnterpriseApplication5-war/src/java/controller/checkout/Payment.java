/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.checkout;

import entities.customer.Customer;
import entities.purchase_system.CartProduct;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessionbean.customer.CustomerFacadeLocal;
import sessionbean.item.ProductFacadeLocal;
import sessionbean.purchase_system.CartProductFacadeLocal;

/**
 *
 * @author Manh
 */
@WebServlet(name = "Payment", urlPatterns = {"/Payment"})
public class Payment extends HttpServlet {

    @EJB
    CustomerFacadeLocal cfl;

    @EJB
    CartProductFacadeLocal cpfl;

    @EJB
    ProductFacadeLocal pfl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        Customer customer = cfl.findByUsername(username);
        int customerID = customer.getCustomerID();

        List<CartProduct> cartProducts = cpfl.findByStatusAndCustomerID(0, customerID);
        Double total = 0.0;
        for (CartProduct cp : cartProducts) {
            total += cp.getProductProductID().getPrice();
        }
        
        request.setAttribute("total", total);
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/cart/payment.jsp");
        dispatcher.forward(request, response);

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
