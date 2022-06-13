/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej1_hito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;



/**
 *
 * @author javi_
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1.1");
        Animal anima11=new Animal("Pepe","Perro",3);
        Perro perro1=new Perro("Pedro","perro",5);       
        //Java no permite realizar herencia múltiple debido principalmente a los problemas de ambiguedad, es por eso que java 
        //utiliza como solución la herencia múltiple de interfaces,es decir que un mismo objeto puede heredar varias firmas de métodos diferente,
        //En resumen se pueden implementear varias interfaces pero no varias clases
        System.out.println("---------------------------------------------");
        System.out.println("Ejercicio 1.2");
        System.out.println("Un ejemplo de Sobreescritura:");
        System.out.println(anima11.comer());
        System.out.println(perro1.comer());
        //Hemos sobreescrito el método comer por lo que en la clase animal mostrará animal comiendo
        //mientras que en la clase perro mostrará perro comiendo
        System.out.println("Un ejemplo de Sobrecarga:");
        anima11.dormir();
        anima11.dormir(8);
        //Hemos sobrecargado una clase de forma que en la clase animal haya dos métodos dormir 
        //que tienen el mismo nombre pero distintos argumentos en el primer método dormir se devuelve el animal esta durmiendo
        //mientras que en el segundo le pasamos un int para que nos devuelva el animal duerme y el numero de horas que le hayamos pasado
        System.out.println("---------------------------------------------");
        System.out.println("Ejercicio 1.3");
        System.out.println("Ejemplo de Lista");
        //Se puden utilizar para almacenar una lista de objetos, forma parte de la biblioteca de Java (como String y Math)
        //Es dinámico aumenta o reduce conforme se van agregando o eliminando elementos
        ArrayList<String> animales=new ArrayList<>();
        animales.add("perro");
        animales.add("gato");
        animales.add("ballena");
        animales.add("escarabajo");
        
        System.out.println("Ejemplo de Pila");
        // Los elementos se agregan a una colección en la que el primer elemento insertado sale en el último."
        // La colección está representada por la clase Stack en Java del paquete java.util
        Stack pila=new Stack();
        for(int i=0;i<10;i++){
        pila.push(i);
        }  
        System.out.println(pila);
        System.out.println("Ejemplo de Cola");
        // Es un tipo de dato abstracto
        //Al igual que la lista los elementos que se introducen primero se muestra el último. FIFO (First In First Out)
        Queue<Integer> cola=new LinkedList();
        for (int i = 0; i < 10; i++) {
            cola.offer(i); //offer() sirve para agregar datos a la cola
        }
        System.out.println(cola);
        
        //Aquí lo podemos ver al usar el método remove eliminamos el último elemento insertado, en este caso el 0.
        
        cola.remove();
        System.out.println(cola);
        
        
        
        System.out.println("Ejemplo de Tabla");
        
        //Conseguimos almacenar valores como si fuesen tablas a través de ArrayList multidimensionales
        
        ArrayList<String> innerArraylist;
        innerArraylist = new ArrayList<String>();
        List<ArrayList<String>> outerArrayList = new ArrayList<>();
        innerArraylist.add("String One");
        innerArraylist.add("String Two");
        innerArraylist.add("String Three");
        outerArrayList.add(innerArraylist);
        System.out.println(outerArrayList.toString());
    }
}
