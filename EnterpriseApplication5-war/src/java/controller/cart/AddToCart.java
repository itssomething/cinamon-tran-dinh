/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.cart;

import entities.customer.Customer;
import entities.purchase_system.Cart;
import entities.purchase_system.CartProduct;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
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
@WebServlet(name = "AddToCart", urlPatterns = {"/AddToCart"})
public class AddToCart extends HttpServlet {

    @EJB
    CartProductFacadeLocal cpfl;

    @EJB
    CustomerFacadeLocal cfl;
    
    @EJB
    ProductFacadeLocal pfl;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        Customer customer = cfl.findByUsername(username);
        int customerID = customer.getCustomerID();
        int productID = Integer.parseInt(request.getParameter("productID"));
        
        
        // TODO: PROCESS IN CARTPRODUCT TABLE SHIT
        CartProduct cartProduct = new CartProduct();
        try{
            cartProduct = cpfl.findByProductAndCustomer(productID, customerID);
            if(cartProduct!=null){
                // to do: add quantity field
                cartProduct.setQuantity(cartProduct.getQuantity() + 1);
                cpfl.edit(cartProduct);
                // add a save or update method here
            }
        }
        catch(Exception e) {
            cartProduct.setCustomerCustomerID(customer);
            cartProduct.setProductProductID(pfl.findByProductID(productID));
            cartProduct.setQuantity(1);
            cpfl.create(cartProduct);
        }
        
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
//        processRequest(request, response);
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        Customer customer = cfl.findByUsername(username);
//        Cart cart = cpfl.findBy
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
