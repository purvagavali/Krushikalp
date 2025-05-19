package com.algo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.codec.binary.Base64;

public class getFile extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/plain;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String base64Data = request.getParameter("uploaded_file");
            String fileName = request.getParameter("filename");
            String displayName = request.getParameter("filename");
            String category = request.getParameter("cat");

            System.out.println("Received fileName: " + fileName);
            System.out.println("Display name fff: " + displayName);
            System.out.println("Category: " + category);

            if (base64Data == null || fileName == null) {
                out.println("Missing required parameters.");
                return;
            }

            byte[] decodedBytes = Base64.decodeBase64(base64Data);

            // Save the uploaded image
            String saveDir = request.getServletContext().getRealPath("/test");
            System.out.println(""+saveDir);
            
            File uploadDir = new File(saveDir);
            if (!uploadDir.exists()) uploadDir.mkdirs();

            File imageFile = new File(uploadDir, fileName);
            System.out.println("path"+uploadDir+"/"+fileName);
            try (FileOutputStream fos = new FileOutputStream(imageFile)) {
                fos.write(decodedBytes);
            }

            System.out.println("Image saved at: " + imageFile.getAbsolutePath());

            // Extract GLCM features
            GLCMFeatureExtraction glcm = new GLCMFeatureExtraction(imageFile, 15);
            glcm.extract();

            double dissimilarity = glcm.getDissimilarity();
            System.out.println("Extracted Dissimilarity: " + dissimilarity);

            // Database comparison
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aipower_agri", "root", "");
                 PreparedStatement ps = con.prepareStatement("SELECT * FROM train_data");
                 ResultSet rs = ps.executeQuery()) {
                
                boolean found = false;

                while (rs.next()) {
                    double storedDissimilarity = Double.parseDouble(rs.getString("Dissimilarity"));

                    if (Double.compare(storedDissimilarity, dissimilarity) == 0) {
                        found = true;
                        String disease = rs.getString("disese_name");
//                        String content = rs.getString("content");
                        out.println(disease);
                        break;
                    }
                }

                if (!found) {
                    out.println("0");
                }

            } catch (Exception dbEx) {
                dbEx.printStackTrace();
                out.println("Database error: " + dbEx.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Handles image upload and classification using GLCM feature comparison.";
    }
}