/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author marcosfa
 */
public class Clients {
    String dni ;
    String name ;
    String apellidos;
    float descuento;
    String country ;
    int n_orders;
    Date inscription_date;
    String postal_code ;
    String address ;
    String phone;


    //Here we will storage temporaly all the clients
   public static ArrayList <Clients>clients = new ArrayList<>();

    /**
     * Constructor of the object Client with all params
     * @param dni
     * @param name
     * @param apellidos
     * @param descuento
     * @param country
     * @param n_orders
     * @param inscription_date
     * @param postal_code
     * @param address
     * @param phone
     */
    public Clients(String dni, String name, String apellidos, float descuento, String country, int n_orders, Date inscription_date, String postal_code, String address, String phone) {
        this.dni = dni;
        this.name = name;
        this.apellidos = apellidos;
        this.descuento = descuento;
        this.country = country;
        this.n_orders = n_orders;
        this.inscription_date = inscription_date;
        this.postal_code = postal_code;
        this.address = address;
        this.phone = phone;
    }
    public Clients(){

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getN_orders() {
        return n_orders;
    }

    public void setN_orders(int n_orders) {
        this.n_orders = n_orders;
    }

    public Date getInscription_date() {
        return inscription_date;
    }

    public void setInscription_date(Date inscription_date) {
        this.inscription_date = inscription_date;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Clients{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", descuento=" + descuento +
                ", country='" + country + '\'' +
                ", n_orders=" + n_orders +
                ", inscription_date=" + inscription_date +
                ", postal_code='" + postal_code + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
