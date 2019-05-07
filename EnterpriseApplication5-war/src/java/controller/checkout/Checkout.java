/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.checkout;

import entities.attribute.Account;
import entities.attribute.Address;
import entities.attribute.FullName;
import entities.attribute.Phone;
import entities.attribute.FullName;
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
import sessionbean.attribute.AddressFacadeLocal;
import sessionbean.attribute.FullNameFacadeLocal;
import sessionbean.attribute.PhoneFacadeLocal;
import sessionbean.customer.CustomerFacadeLocal;
import sessionbean.purchase_system.CartProductFacadeLocal;

/**
 *
 * @author Manh
 */
@WebServlet(name = "Checkout", urlPatterns = {"/Checkout"})
public class Checkout extends HttpServlet {

    @EJB
    CustomerFacadeLocal cfl;

    @EJB
    CartProductFacadeLocal cpfl;

    @EJB
    AddressFacadeLocal afl;

    @EJB
    PhoneFacadeLocal pfl;

    @EJB
    FullNameFacadeLocal ffl;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        Customer customer = cfl.findByUsername(username);
        int customerID = customer.getCustomerID();

//        List<CartProduct> cartProductList = cpfl.findByCustomerID(customerID);

//        Address address = new Address();
//        Phone phone = new Phone();
//        FullName fullName = new FullName();

        Address address = afl.findByCustomerID(customerID);
        Phone phone = pfl.findByCustomerID(customerID);
        FullName fullName = ffl.findByCustomerID(customerID);

        request.setAttribute("address", address);
        request.setAttribute("phone", phone);
        request.setAttribute("fullName", fullName);

        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/cart/checkout-step-two.jsp");
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