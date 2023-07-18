/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import clases.Employe;
import java.util.ArrayList;

/**
 *
 * @author marcosfa
 */
public class Validation {
    
    
    /**
     * Method that search on our ArrayList of employes Username and Password and if it fits, the will give you acces to the app
     * @param dni Username
     * @param pwd Password
     * @return True or False
     */
    public Boolean logIn(String dni,String pwd){
        Boolean found = false;
        for (int i = 0; i < Employe.employees.size(); i++) {
           Employe user = Employe.employees.get(i);
           if(user.getDni().equals(dni) && user.getPwd().equals(pwd)){
               System.out.println("El dni el usuario coincide "+user.getDni()+" ==> "+dni +" Y la contraseña también  " + user.getPwd()+ " ==> "+ pwd);
               found = true;
               break;
               
           }
            
           
            
        }
        return found;
    }
    
    //para terminar más tarde
    public Boolean signUpEmploye(String name){
        return true;
    }


    
    
  
    
}
