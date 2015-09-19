/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.noe.provas.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nilton
 */
public class ConnectionFactory {
    
    public static Connection getConnection() {
        try {

            return DriverManager.getConnection(
                    PropertiesUtil.getStringValue(PropertiesUtil.KEY_JDBC_URL), 
                    PropertiesUtil.getStringValue(PropertiesUtil.KEY_JDBC_LOGIN), 
                    PropertiesUtil.getStringValue(PropertiesUtil.KEY_JDBC_SENHA));

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
