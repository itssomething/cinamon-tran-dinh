/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountDAO;
import entities.attribute.Account;
import entities.customer.Customer;
import form.CustomerForm;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessionbean.attribute.AccountFacadeLocal;
import sessionbean.customer.CustomerFacadeLocal;

/**
 *
 * @author Manh
 */
@WebServlet(name = "CustomerCreate", urlPatterns = {"/CustomerCreate"})
public class CustomerCreate extends HttpServlet {

    @EJB
    AccountFacadeLocal afl;

    @EJB
    CustomerFacadeLocal cfl;
    private static final long serialVersionUID = 1L;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet UserCreate</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet UserCreate at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
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
        CustomerForm customerForm = new CustomerForm();
        request.setAttribute("customer", customerForm);

        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/signUpView.jsp");
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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        String firstName = request.getParameter("firstName");
//        String middleName = request.getParameter("middleName");
//        String lastName = request.getParameter("lastName");
//        String district = request.getParameter("district");
//        String city = request.getParameter("city");
//        String country = request.getParameter("country");
//        String sectionCode = request.getParameter("sectionCode");
//        String phoneNumber = request.getParameter("phoneNumber");

        Account account = new Account();
        afl.createAccount(username, password);
        account = afl.findByUserName(username);
        Integer id = account.getAccountID();
        Customer customer = new Customer();
        
        
        customer.setAccountAccountID(account);
        cfl.create(customer);
//        
////        request.getRequestDispatcher("/WEB-INF/views/test.jsp").forward(request, response);
//        
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/signUpView.jsp");
        dispatcher.forward(request, response);

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

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
