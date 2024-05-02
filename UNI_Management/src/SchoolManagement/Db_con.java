/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SchoolManagement;

import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author usama
 */
public class Db_con {
   Connection con;
   Statement st;
   ResultSet rs;
   int count;
//   ResultSet rs1;
   PreparedStatement st1;
   Db_con(){
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizforge","root","");
           st = con.createStatement();
           System.out.println("DATABASE IS CONNECTED");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Db_con.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Db_con.class.getName()).log(Level.SEVERE, null, ex);
       }
   } 
   public ResultSet matchUser(String userEmail,String userPassword){
       
       try {
           String mysqlQuery = "Select * From teacherinfo where Email ='"+userEmail+"'And Password='"+userPassword+"'";
           rs = st.executeQuery(mysqlQuery);   
       } catch (SQLException ex) {
           Logger.getLogger(Db_con.class.getName()).log(Level.SEVERE, null, ex);
       }
       return rs;
   }
   
public String fetchUserName(String userEmail) {
    String username;
    String fetchUserQuery = "SELECT UserName FROM teacherinfo WHERE Email = ?";
    try {
        PreparedStatement st = con.prepareStatement(fetchUserQuery);
        st.setString(1, userEmail);
         rs = st.executeQuery();
        if (rs.next()) {
            username =  rs.getString("UserName");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Db_con.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
}

   
public ResultSet matchEmail(String checkEmail){
       try {
           String checkEmailQuery = "Select * From teacherinfo where Email ='"+checkEmail+"'";
           st1 = con.prepareStatement(checkEmailQuery);
           rs = st1.executeQuery();
       } catch (SQLException ex) {
           Logger.getLogger(Db_con.class.getName()).log(Level.SEVERE, null, ex);
       }
 return rs;
}
 public ResultSet userRegister(String name, String password,String email){
       try {
           String query = "INSERT INTO teacherinfo (`UserName`, `Password`, `Email`) VALUES (?, ?, ?);";
           PreparedStatement st = con.prepareStatement(query);
           st.setString(1,name);
           st.setString(2, password);
           st.setString(3,email);
           count = st.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(Db_con.class.getName()).log(Level.SEVERE, null, ex);
       }
           return rs;
 }




}
     
