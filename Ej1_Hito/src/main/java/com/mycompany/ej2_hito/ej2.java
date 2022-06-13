/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej2_hito;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author javi_
 */
public class ej2 {
    public static void main(String[] args) throws FileNotFoundException {
        int i=0;
        double contador=0;
        //Creamos dos contadores uno para contar la nota y otro para usarlo en el while
        Scanner quest=new Scanner(ej2.class.getResourceAsStream("Preguntas.txt"));
        Scanner sol=new Scanner(ej2.class.getResourceAsStream("Respuestas.txt"));
        //Leemos cada línea de las preguntas y las respuestas en 2 scaneres
        ArrayList<String>resp=new ArrayList<>();
        while(sol.hasNextLine()){
        resp.add(sol.nextLine());
        }
        //Almacenamos las respuestas en un arraylist 
        System.out.println("Todas las respuestas deberán escribirse su primera letra en mayuscula");
        Scanner respuesta=new Scanner(System.in);
        //Creamos un Scanner para almacenar la respuesta del usario
        while(quest.hasNextLine()){
            System.out.println(quest.nextLine());           
            String re=respuesta.next();
            if (!re.equals(resp.get(i))) {
                contador=contador-0.5;
                System.out.println("Respuesta incorrecta -0,5 punto");
            } else{
                contador=contador+1;
                System.out.println("Respuesta correcta +1 punto");
            }
            i++;
        }
        //Hacemos un bucle que nos imprima todas las preguntas y nos compare la nuestra respuesta con la solución y que nos sume o reste dependiendo de si es correcta o no
        if(contador<5){
            System.out.println("Has suspendido");
        }
        else if(contador>=5 && contador<7){
            System.out.println("Nota: Bien");
    }
        else if(contador>=7 && contador<9){
            System.out.println("Nota: Notable");
    }
         else{
            System.out.println("Nota: Sobresaliente");
    }
        //Hacemos un if else para asignar nota en letras a la nota numérica
        System.out.println("Puntuación total: "+contador);
        for (String respuestaacer : resp) {
        System.out.println("Las respuestas son: "+respuestaacer);
        //Sacamos la respuesta correcta y la puntación total
        }
    }
}
