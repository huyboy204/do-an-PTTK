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

/**
 *
 * @author TienVinh
 */
public class Customer_DAL {
    public Customer_DAL(){};
    public boolean Insert(Customer_DTO cus){
        try {
            Object arg[]= {cus.getCustomer_id(),cus.getFullname(),cus.getCccd(),cus.getPhoneNumber(),cus.getDateOfBird()};

            String cus_SQL;
            cus_SQL = String.format("INSERT INTO Client VALUES ('%s','%s','%s','%s','%s','%s')",arg);

            Statement statement = login_gui.Login_GUI.conection.conn.createStatement();

            int rows_employee = statement.executeUpdate(cus_SQL);
            if (rows_employee > 0){
                System.out.println("Insert successfull");
            }else {
                System.out.println("Insert fail");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return false;
        
    }
     public boolean Delete(Customer_DTO cus){
        try {
            Object arg[]= {cus.getCustomer_id()};
            String sql;
            sql = String.format("DELETE FROM Client WHERE ID  = '%s'", arg);
            Statement statement = login_gui.Login_GUI.conection.conn.createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0 ){
                System.out.println("Delete successfull");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public boolean Update(Customer_DTO cus) {
        try {
            Object arg[]= {cus.getFullname(),cus.getCccd(),cus.getPhoneNumber(),cus.getDateOfBird(),cus.getCustomer_id()};
            String sql;
            sql = String.format("UPDATE Staff SET FullName='%s', cccd='%s', phoneNumber='%s', DateOfBird='%s' WHERE CID  = '%s'", arg);
            Statement statement = login_gui.Login_GUI.conection.conn.createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0){
                System.out.println("Update successfull");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;

    }
    public List SelectData(String selectSql){
        List<Customer_DTO> list_cus = new ArrayList<>(); 

        try {
     
            String sql = selectSql;
            ResultSet rs = login_gui.Login_GUI.conection.conn.createStatement().executeQuery(sql);
            while (rs.next()){
                Customer_DTO em = new Customer_DTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                list_cus.add(em);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        return list_cus;
    }
}