/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.algo.GLCMFeatureExtraction;
import com.db.Dbcon;
import com.oreilly.servlet.MultipartRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sunandainfotech
 */
public class Add_Data extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Add_Data</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Add_Data at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        processRequest(request, response);
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
          PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        try {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            Double d1, val1;
            BufferedImage image = null;
            String line = "";
            String idd="1";//(String)session.getAttribute("did");
            String path = getServletContext().getRealPath("/");

            String base_path1 = request.getRealPath("/") + "files1";
String uploadpath = "C:\\Users\\purva\\OneDrive\\Desktop\\Agri AI 6_march_23\\AIPowerAgriculture\\web\\upload";

//C:\Users\purva\OneDrive\Desktop\Agri AI 6_march_23\AIPowerAgriculture
//            String uploadpath = getServletContext().getRealPath("/") + "upload/";
            MultipartRequest multipartRequest = new MultipartRequest(request, uploadpath);
            String textfile = multipartRequest.getParameter("uimg");
            session.setAttribute("uimg", textfile);
            String d_name = multipartRequest.getParameter("d_name");
             String d_precautions = "null";//multipartRequest.getParameter("d_precautions");
             String symp = "null";
           
//            String Topic = multipartRequest.getParameter("topic");
            System.out.println("d precautions"+d_precautions);
            File text = multipartRequest.getFile("uimg");
            textfile = text.getName();
            System.out.println("path"+uploadpath);
//            int index = textfile.lastIndexOf(".");
//            textfile = textfile.substring(0, index);
//            textfile = textfile + ".png";
//
//            String path1 = text.toString();
//            System.out.println("Hey I am here :----->" + path1);
//            System.out.println("File Path " + text);
//            System.out.println("file name:" + text.getName());
            
             GLCMFeatureExtraction glcmfe = new GLCMFeatureExtraction(new File(uploadpath+"/"+textfile), 15);
			glcmfe.extract();
			
			System.out.println("Contrast: "+glcmfe.getContrast());
			System.out.println("Homogenity: "+glcmfe.getHomogenity());
			System.out.println("Entropy: "+glcmfe.getEntropy());
			System.out.println("Energy: "+glcmfe.getEnergy());
			System.out.println("Dissimilarity: "+glcmfe.getDissimilarity());

            Statement statement = Dbcon.connect();

            String sql = "INSERT INTO `train_data` (`disese_name`, `disease_symp`, `disease_pre`, `disease_image`, `Contrast`, `Homogenity`, `Entropy`, `Energy`, `Dissimilarity`, `did`) VALUES ('" + d_name + "','" + symp + "','" + d_precautions + "','" + textfile + "','" + glcmfe.getContrast() + "','" + glcmfe.getHomogenity() + "','" + glcmfe.getEntropy() + "','" + glcmfe.getEnergy() + "','" + glcmfe.getDissimilarity() + "','"+idd+"');";
             System.out.println("sql=" + sql);
            
            statement.executeUpdate(sql);
            System.out.println("sql=" + sql);
 //            String sql1 = "select * from data where textfile='" + textfile + "'";
//            Statement statement1 = com.db.Dbcon.connect();
//            ResultSet rs1 = statement.executeQuery(sql);
//            while (rs1.next()) {
//
//                //  Integer file_id = rs1.getInt("Data_id");
//                // String fileid = file_id.toString();
//
//                //  boolean flag = Tf_Idf.calculate(uploadpath, base_path1, textfile, fileid);
//                System.out.println("Inserted Successfully");
//            }
 session.setAttribute("flash_message", "Added Product Successfully !!!");
            session.setAttribute("flash_type", "success");
            response.sendRedirect("ViewData.jsp");


        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            out.close();
        }

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
