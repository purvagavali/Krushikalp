/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sunandainfotech
 */
public class Admin_Login extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);
        PrintWriter out = response.getWriter();
        try {
            
            String username1 = request.getParameter("username");
            String password = request.getParameter("password");
            if (username1.equals("admin") && password.equals("123")) {
//                HashMap<String, String> data = new HashMap<String, String>();
//                data.put("id", "0");
//                data.put("username1", "admin");
//                data.put("full_name", "Admin");
//                session.setAttribute("username1",username1 );
//                session.setAttribute("User", data);
                session.setAttribute("UserType", "admin");
//
//                session.setAttribute("flash_message", "Logged in successfully !!!");
//                session.setAttribute("flash_type", "success");

//                response.sendRedirect("admin_dashboard.jsp");
                 response.sendRedirect("TrainData.jsp");
                
            } else {
                session.setAttribute("flash_message", "username or password incorrect");
                session.setAttribute("flash_type", "fail");

                response.sendRedirect("login.jsp");
            }

        } catch (Exception ex) {
            Logger.getLogger(Admin_Login.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }


    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
