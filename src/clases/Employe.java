/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author marcosfa
 */
public class Employe {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String puesto;
    private String pwd;
    
    
    //ArrayList where all ythe employees are saved
    public static ArrayList<Employe> employees = new ArrayList<>();

    public Employe(String dni, String nombre, String apellido, int edad, String puesto, String pwd) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.puesto = puesto;
        this.pwd = pwd;
    }
    
   public Employe(){
   }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getPwd() {
        return pwd;
    }

    public static ArrayList<Employe> getEmployees() {
        return employees;
    }

   
   
   
    @Override
    public String toString() {
        return "dni " + dni + ", nombre " + nombre + ", apellido " + apellido + ", edad " + edad + ", puesto " + puesto + ", pwd " + pwd + '}';
    }
   
    
}
