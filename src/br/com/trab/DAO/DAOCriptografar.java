/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trab.DAO;

import br.com.trab.classe.Criptografia;

import br.com.trab.conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dell1
 */
public class DAOCriptografar {
   private Connection con;
   private PreparedStatement stmt;
   private ResultSet rs;
   private String comandosql;  
   private String comandosql2;  
   public  static int id;
    public ArrayList<Criptografia> lista=  new ArrayList<Criptografia>();

   public DAOCriptografar(){
   con=ConnectionFactory.getConnection();
}

 public ArrayList<Criptografia> retorneT(String n){
    
     for(int i=0; i<n.length(); i++){
          
         comandosql="select traducao from criptografar where letra=?";
         try {
             String l =new Character(n.charAt(i)).toString();
             stmt=con.prepareStatement(comandosql);
             stmt.setString(1,l);
             rs=stmt.executeQuery();
                while(rs.next()){
                    Criptografia obj= new Criptografia();
                    obj.setTraducao(rs.getString("traducao"));
                    lista.add(obj);
                }
         } catch (SQLException ex) {
             Logger.getLogger(DAOCriptografar.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
      JOptionPane.showMessageDialog(null, "Aguarde Criptografando");
     return lista;
 }
  public ArrayList<Criptografia> retorneD(){
          comandosql="select * from criptografar";
         try {
             stmt=con.prepareStatement(comandosql);
             rs=stmt.executeQuery();
                while(rs.next()){
                    Criptografia obj= new Criptografia();
                    obj.setLetra(rs.getString("letra"));
                    obj.setTraducao(rs.getString("traducao"));
                    
                    lista.add(obj);
                }
                
         } catch (SQLException ex) {
             Logger.getLogger(DAOCriptografar.class.getName()).log(Level.SEVERE, null, ex);
         }
     return lista;
 }
 
 
 

 
   
    
}





















