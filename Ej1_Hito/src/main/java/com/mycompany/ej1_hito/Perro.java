/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej1_hito;

/**
 *
 * @author javi_
 */
//Tenemos la clase perro que hereda de Animal y que hereda los atributos y métodos de Animal 
public class Perro extends Animal{
    
    public Perro(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        public String comer(){
        return("El perro come");
       
    }
}
