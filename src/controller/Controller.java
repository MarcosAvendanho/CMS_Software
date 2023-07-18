/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JPasswordField;
import model.Validation;
import view.View;

/**
 *
 * @author marcosfa
 */
public class Controller {
    
    
    public void login(String user, JPasswordField pwd){
        
        char[] characters = pwd.getPassword();

        StringBuilder password = new StringBuilder();
        for (char character : characters) {
            password.append(character);

        }
        
        
        Validation x = new Validation();
        Boolean loged =false;
        loged =x.logIn(user, password.toString());
        
        if(loged){
            View.showSelect();
        }

    }

    public static void main(String[] args) {
        View.showLogIn();

    }



    
}
