/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import Dao.BillDao;
import DTO.Bill;
import java.util.ArrayList;

/**
 *
 * @author tindoan
 */
public class BillBus {
        BillDao Bill = new BillDao();
       public boolean insertBill (Bill b) throws Exception{
           return Bill.insertBill(b);
       }
       
       public int getBillMax() throws Exception{
           return Bill.getBillMax();
       }
       
        public ArrayList<Bill>getAllRows()throws Exception{
            return Bill.getAllRows();
        }
        
        public ArrayList<Bill>getAllRowsDate(String date)throws Exception{
            return Bill.getAllRowsDate(date);
        }
       
       
}
