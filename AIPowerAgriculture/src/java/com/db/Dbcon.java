/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author siddharth
 */
public class Dbcon {
    static Connection connection = null;
    static Statement statement = null;
    static PreparedStatement prestmt = null;

    public static Statement connect() throws Exception {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "aipower_agri";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";

        try {
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(url + dbName, userName, password);
            // If we are going to insert a Duplicate entry for PRIMARYKEY, we will get an exception
            // com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException
            statement = connection.createStatement();
            //System.out.println("Connected to the database");


        } catch (Exception e) {
        } finally {
        }
        return statement;
    }
      public static Connection connect1() throws Exception {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "lungcancer_detection";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";

        try {
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(url + dbName, userName, password);
            // If we are going to insert a Duplicate entry for PRIMARYKEY, we will get an exception
            // com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException
            

        } catch (Exception e) {

            System.out.println(""+e.getMessage());
        } finally {
        }
        return connection;
      }

    public static void close() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dbcon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static long getInsertId() {
        try {
            Object[] insertIds = getInsertIds();
            return Long.parseLong("" + insertIds[0]);
        } catch (Exception e) {
            return -1;
        }
    }

    public static Object[] getInsertIds() {
        try {
            if (statement != null) {
                Dbcon.statement = statement;
            } else {
                statement = Dbcon.statement;
            }
            ResultSet generatedKeys = statement.getGeneratedKeys();
            ArrayList<Long> keys = new ArrayList<Long>();
            while (generatedKeys.next()) {
                keys.add(generatedKeys.getLong(1));
            }
            return keys.toArray();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

}
