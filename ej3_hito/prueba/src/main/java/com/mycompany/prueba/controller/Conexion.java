/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author joanc
 */
public class Conexion {
    //variable de clase, global
    public Connection conectar() {
		Connection DbConnection = null; //variable de método
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");//esta no está depreciada
		DbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_crud","root","");
	} 		catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return DbConnection;
	}
}
