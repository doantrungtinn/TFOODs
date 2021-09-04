/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.CategoryDao;
import DTO.Category;
import java.util.ArrayList;

/**
 *
 * @author tindoan
 */
public class CategoryBus {
    CategoryDao Category = new CategoryDao();
    
    public ArrayList<Category>getAllRows()throws Exception{
        return Category.getAllRows();
    }
    
}
