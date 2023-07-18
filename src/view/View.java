/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author marcosfa
 */
public class View {
    public static void showInvoice(){
        Invoice x = new Invoice();
        x.setVisible(true);
    }
    public static void showLogIn(){
        Log_in x = new Log_in();
        x.setVisible(true);
    }
    public static void showSelect(){
        Select x = new Select();
        x.setVisible(true);
    }
    
    public static void showDatabase(){
        Database x = new Database();
        x.setVisible(true);
    }
}
