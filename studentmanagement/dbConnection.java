/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;
import java.sql.*;  
import java.io.*;  
/**
 *
 * @author RT Nexgen
 */
public class dbConnection { 
    public static void main(String[] args) {  
try{  

                    
                    
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/studentmanagemament","root","RTnexgen@123");
PreparedStatement ps=con.prepareStatement("insert into new_table (id,name,email,mobile) values(?,?,?,?)");  

ps.setInt(1,11);  
ps.setString(2,"Ankit");
ps.setString(3,"ankit@gmail.com");  
ps.setString(4,"9586741123");  
ps.execute();
    
}
catch (Exception e) {e.printStackTrace();}  
    
 }
}