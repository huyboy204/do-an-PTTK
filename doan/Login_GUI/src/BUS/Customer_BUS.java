/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.Customer_DAL;
import DTO.Customer_DTO;

/**
 *
 * @author TienVinh
 */
public class Customer_BUS {

    public Customer_BUS() {
    };
    Customer_DAL cus_DAL = new Customer_DAL();
    public void Insert(Customer_DTO cus){
        cus_DAL.Insert(cus);
    }
    public void Delete(Customer_DTO cus){
        cus_DAL.Delete(cus);
    }
    public void Update(Customer_DTO cus){
        cus_DAL.Update(cus);
    }
    public void Select(String sqlString){
        cus_DAL.SelectData(sqlString);
    }
}
