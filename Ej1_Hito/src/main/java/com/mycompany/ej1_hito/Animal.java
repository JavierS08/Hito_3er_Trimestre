/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej1_hito;

/**
 *
 * @author javi_
 */

//Creamos una clase Animal que contará con atributos privados y con los métodos comer y dormir
public class Animal {
      String nombre;
      String raza;
      int edad;

    public Animal(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
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
        return("El Animal come");     
    }
    //Ejemplo de sobrecarga de métodos:
    public void dormir() {
        System.out.println("El animal duerme");
    }
    public void dormir(int h){
        System.out.println("El animal duerme "+h+" horas");
    }
}
