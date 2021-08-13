/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Models.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ibrahim Mohamed
 */
public class Data {
     private static ArrayList<User> users=new ArrayList<>();
     public static void addUser(String username,String password){
         users.add(new User(username,password));
     }
     public static List<User> getUsers(){
        return users;
     }
     
    
}
