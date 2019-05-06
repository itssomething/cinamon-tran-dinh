/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.computer;

import entities.item.Computer;
import entities.item.Discount;
import entities.item.Product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessionbean.item.ComputerFacadeLocal;
import sessionbean.item.DiscountFacadeLocal;
import sessionbean.item.ProductFacadeLocal;

/**
 *
 * @author Manh
 */
@WebServlet(name = "ComputerCreate", urlPatterns = {"/ComputerCreate"})
public class ComputerCreate extends HttpServlet {
    
    @EJB
    ComputerFacadeLocal cfl;
    
    @EJB
    ProductFacadeLocal pfl;
    
    @EJB
    DiscountFacadeLocal dfl;
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
        
        
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/computer/newComputer.jsp");
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
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String stock = request.getParameter("stock");
        String brand = request.getParameter("brand");
        String ram = request.getParameter("ram");
        String processor = request.getParameter("processor");
        String hardDrive = request.getParameter("hardDrive");
        String os = request.getParameter("os");
        String color = request.getParameter("color");
        String screenSize = request.getParameter("screenSize");
        
        Computer computer = new Computer();
        Product product = new Product();
        
        product.setName(name);
        product.setPrice(Double.parseDouble(price));
        product.setStock(Integer.parseInt(stock));
        product.setBrand(brand);
        Discount dc = dfl.findFirst();
        product.setDiscountDiscountID(dc);
        
        computer.setRam(ram);
        computer.setProcessor(processor);
        computer.setHardDrive(hardDrive);
        computer.setOs(os);
        computer.setColor(color);
        computer.setScreenSize(screenSize);
        
        pfl.create(product);
        
        computer.setProductProductID(product.getProductID());
        
        cfl.create(computer);
        
        request.setAttribute("product", product);
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/computer/test.jsp"); 
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

}
