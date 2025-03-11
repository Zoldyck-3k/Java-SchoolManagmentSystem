/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

/**
 *
 * @author RT Nexgen
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class ZNewClass {

    String name;
    String num;
    int yn;
    ZNewClass(){
        Scanner sc = new Scanner(System.in);

        do{
        System.out.print("Enter Your Name : ");
         name = sc.nextLine();
        System.out.print("Enter your number: ");
        num = sc.nextLine();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/studentmanagemament","root","RTnexgen@123");
            PreparedStatement ps=con.prepareStatement("insert into znewclass (Name,Number) values(?,?)");

            ps.setString(1,name);
            ps.setString(2,num);
            ps.execute();
            System.out.println("Updated");

        }
        catch (Exception e) {e.printStackTrace();System.out.println("Error");}

        System.out.println("If you Want to add more press '1' else press '0'" ) ;
        yn = sc.nextInt();

        }while(yn==1);

    }


    public static void main(String args[]){
        new ZNewClass();
    }
}
