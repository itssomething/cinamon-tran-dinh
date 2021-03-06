/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.attribute.Account;
import entities.attribute.Address;
import entities.attribute.FullName;
import entities.attribute.Phone;
import entities.customer.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessionbean.attribute.AddressFacadeLocal;
import sessionbean.attribute.FullNameFacadeLocal;
import sessionbean.attribute.PhoneFacadeLocal;
import sessionbean.customer.CustomerFacadeLocal;

/**
 *
 * @author Manh
 */
@WebServlet(name = "CustomerInfoEdit", urlPatterns = {"/CustomerInfoEdit"})
public class CustomerInfoEdit extends HttpServlet {

  @EJB
  CustomerFacadeLocal cfl;

  @EJB
  AddressFacadeLocal adressfl;

  @EJB
  FullNameFacadeLocal ffl;

  @EJB
  PhoneFacadeLocal pfl;

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
    String userID = request.getParameter("userID");
    int id = Integer.parseInt(userID);
    Customer customer = cfl.findByID(id);
    Account account = customer.getAccountAccountID();
    FullName fullName = customer.getFullNameFNID();
    Address address = customer.getAddressAddressID();
    Phone phone = customer.getPhonePhoneID();

    request.setAttribute("customer", customer);
    request.setAttribute("account", account);
    request.setAttribute("fullName", fullName);
    request.setAttribute("address", address);
    request.setAttribute("phone", phone);
    request.setAttribute("userID", userID);

    RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/customer/customerInfoEdit.jsp");
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
    String firstName = request.getParameter("firstName");
    String middleName = request.getParameter("middleName");
    String lastname = request.getParameter("lastName");
    String district = request.getParameter("district");
    String city = request.getParameter("city");
    String country = request.getParameter("country");
    String sectionCode = request.getParameter("sectionCode");
    String phoneNumber = request.getParameter("phoneNumber");

//        Account account = new Account();
//        FullName fullName = new FullName();
//        Address address = new Address();
//        Phone phone = new Phone();
    // find customer based on userID param
    String userID = request.getParameter("userID");
    int id = Integer.parseInt(userID);
    Customer customer = cfl.findByID(id);

//        account.setPassword(password);
//        account.setUsername(username);
    Address address = new Address();
    address.setCity(city);
    address.setCountry(country);
    address.setDistrict(district);
    adressfl.create(address);
    customer.setAddressAddressID(address);

    FullName fullName = new FullName();
    fullName.setFirstName(firstName);
    fullName.setMiddleName(middleName);
    fullName.setLastname(lastname);
    ffl.create(fullName);
    customer.setFullNameFNID(fullName);

    Phone phone = new Phone();
    phone.setPhonenumber(phoneNumber);
    phone.setSectionCode(sectionCode);
    pfl.create(phone);
    customer.setPhonePhoneID(phone);

    cfl.edit(customer);

    response.sendRedirect(request.getContextPath() + "/CustomerInfo");
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
