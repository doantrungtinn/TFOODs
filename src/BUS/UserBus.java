/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.User;
import Dao.UserDao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author tindoan
 */
public class UserBus {
    UserDao User = new UserDao();
    
    public boolean login(String username, String password) throws Exception{
        return User.login(username, password);
    }
    
    public User getUserLogined(String username, String password) throws SQLException{
        return User.getUserLogined(username, password);
    }
    
    public boolean insert(User user) {
        return User.insert(user);
    }
    
    public ArrayList<User>getAllRows()throws Exception{
        return User.getAllRows();
    }
    
     public int deleteUser(int id){
         return User.deleteUser(id);
     }
     
     public User getbyId(int id){
         return User.getbyId(id);
     }
     
     public int updateUser(User user){
         return User.updateUser(user);
     }
     
}
