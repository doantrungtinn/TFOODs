/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.BillDetailDao;
import DTO.BillDetail;
import DTO.ProductPayment;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author tindoan
 */
public class BillDetailBus {
    BillDetailDao Bill = new BillDetailDao();
    
    public boolean insertBillD(BillDetail billDetail) throws FileNotFoundException {
        return Bill.insertBillD(billDetail);
    }
    
    public ArrayList<ProductPayment>getBillDetails(int idBill)throws Exception{
        return Bill.getBillDetails(idBill);
    }
    
    public ArrayList<String> getDate()throws Exception{
        return Bill.getDate();
    }
    
    
}
