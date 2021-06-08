/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Customer_DTO;

import java.sql.Connection;
import java.sql.*;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Date;  

/**
 *
 * @author TienVinh
 */
public class Customer_DAL {
    public Customer_DAL(){};
    private ConnectionDB_DAL conection = new ConnectionDB_DAL();
    public boolean Insert(Customer_DTO cus){
        conection.OpenConnection();
        try {
            //Date dateOfBird = Date.valueOf(cus.getDateOfBird());
            Object arg[]= {cus.getFullname(),cus.getCccd(),cus.getDateOfBird(),cus.getPhoneNumber()};

            String cus_SQL;
            cus_SQL = String.format("INSERT INTO Client(FullName,CCCD,DateofBirth,PhoneNumber) VALUES ('%s','%s',CONVERT(datetime, '%s', 101),'%s')",arg);

            Statement statement = conection.conn.createStatement();

            int rows_employee = statement.executeUpdate(cus_SQL);
            if (rows_employee > 0){
                System.out.println("Insert successfull");
            }else {
                System.out.println("Insert fail");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally{
            if (conection.conn != null) {
                            conection.CloseConnection();
                            

            }
        }
        
        return true;
        
    }
     public boolean Delete(Customer_DTO cus){
        conection.OpenConnection();
        try {
            Object arg[]= {cus.getCustomer_id()};
            String sql;
            sql = String.format("DELETE FROM Client WHERE ID  = '%s'", arg);
            Statement statement = conection.conn.createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0 ){
                System.out.println("Delete successfull");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            if (conection.conn != null) {
                            conection.CloseConnection();

            }
        }
        return true;
    }
    public boolean Update(Customer_DTO cus) {
                conection.OpenConnection();

        try {
            Object arg[]= {cus.getFullname(),cus.getCccd(),cus.getPhoneNumber(),cus.getDateOfBird(),cus.getCustomer_id()};
            String sql;
            sql = String.format("UPDATE Client SET FullName='%s', cccd='%s', phoneNumber='%s', DateOfBird='%s' WHERE CID  = '%s'", arg);
            Statement statement = conection.conn.createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0){
                System.out.println("Update successfull");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            if (conection.conn != null) {
                            conection.CloseConnection();

            }
        }
        return true;

    }
    public List SelectData(String selectSql){
                conection.OpenConnection();

        List<Customer_DTO> list_cus = new ArrayList<>(); 
        ResultSet rs = null;
        try {
     
            String sql = selectSql;
            rs = conection.conn.createStatement().executeQuery(sql);
            while (rs.next()){
                Customer_DTO em = new Customer_DTO(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                list_cus.add(em);
            }
            System.out.println("select sucecsfull");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
        }finally {

                if (conection.conn != null) {
                    try {
                       conection.conn.close();
                    } catch (SQLException e) { /* Ignored */}
                }
        }
        
        return list_cus;
    }
}
