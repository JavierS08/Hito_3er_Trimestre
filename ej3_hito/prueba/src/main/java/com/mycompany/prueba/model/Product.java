/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba.model;
import java.sql.Date;
/**
 *
 * @author joanc
 */
public class Product {
    //atributos
    private int idProducto;
    private String nombre;
    private Date fechaEnvasado ;
    private int unidades;
    private double precio;
    private boolean disponible;   
    
    //constructor
    public Product(int idProducto,String nombre, Date fechaEnvasado, int unidades, double precio, boolean disponible) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.fechaEnvasado = fechaEnvasado;
        this.unidades = unidades;
        this.precio = precio;
        this.disponible = disponible;
    }
    public Product(String nombre, Date fechaEnvasado, int unidades, double precio, boolean disponible) {
        this.nombre = nombre;
        this.fechaEnvasado = fechaEnvasado;
        this.unidades = unidades;
        this.precio = precio;
        this.disponible = disponible;
    }
    
    //getter / setter
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProductos) {
        this.idProducto = idProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
}
