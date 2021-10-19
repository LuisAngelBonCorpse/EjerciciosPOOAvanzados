package com.generation;

import com.generation.gente.Persona;

public class Main {

    public static void main(String[] args) {
            /*
                Ejercicio 1
                De las clases de una URL, encapsularlas manteniendo la estructura.
            */
            Persona person= new Persona("Santiago", 33, "102045455");
            System.out.println( "Name: " + person.getName());
            System.out.println( "Age: "+ person.getAge());
            System.out.println( "Id: " +  person.getId());
    }
}
