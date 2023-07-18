/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


//we must import the following libraries:
import clases.Employe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *  Model methods conection with database
 *  besides insert, delete
 * @author marcosfa
 */
public class Conection {
    
    //lets create the user atributes, in this case postgres
    private String username = "postgres";
    private String password = "postgres";
    
    //create the url atributes
    private String database = "cms";
    private String ip = "localhost";
    private String port = "5434";
    private String url = null;
    
    //important to define the variable connection
    private Connection conect = null;
    /**
     * This method connect us to the database
     * @param database name to stablish conection
     * @param ip if its localhost or a foreing server
     * @param port which make tghe conection on;
     * @return the connection
     */
    public Connection getConection(){
        this.url = "jdbc:postgresql://"+this.ip+":"+this.port+"/"+this.database;
       try{
           this.conect = DriverManager.getConnection(url);
           System.out.println("Conexion succesful");
           
       }catch(SQLException e){
           System.out.println("An error ocurred durin conection" + e.getMessage());
       }
        return conect;
    }
    
    public void getEmpleados() {
        this.conect = getConection();
        try{
            //this allow us to make sql consults in java
            PreparedStatement statement = conect.prepareStatement("Select * from empresa.empleados");
            ResultSet result = statement.executeQuery();
            //the lines before return a wide range of data so, its importante to make a loop so we can catch it
            while(result.next()){
                //here we'll get the resuklt by the name of the fiel on the table database
                String dni = result.getString("dni");
                String name = result.getString("nombre");
                String surname = result.getString("apellido");
                int age = result.getInt("edad");
                String position = result.getString("puesto");
                String pwd = result.getString("contraseña");
                
                Employe x = new Employe(dni,name,surname,age,position,pwd);
                 Employe.employees.add(x);
                 System.out.println(x);
                
            }
            
            //tras realizar estas operaciones sería interesante cerrar la conexión para ello debemo srealizar lo siguienrte
            result.close();
            statement.close();
            conect.close();
            
        }catch(SQLException e){
            System.out.println("error al obtener los empleados" +e.getMessage());
        }
       
       
        
        
    }
    
    
    public void getClientes(String NIF){
        //get the conection with the database
        this.conect = getConection();
        
        try{
            //query to get all the clients
           PreparedStatement statement = conect.prepareStatement("Select * from empresa.clientes");
           //get the result of the query and saved on the variable result
           ResultSet result = statement.executeQuery();
           
           
        }catch(SQLException e){
            System.out.println("" +e.getMessage());
        }
        
    }
    
    
}
