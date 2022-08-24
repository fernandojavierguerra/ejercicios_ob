package com.ejercicios.tema3;

public class Bucles {

    public static void main(String[] args) {

        String[] nombres = {"Fernando", "Javier", "Agustin", "Andres", "Liliana"};
        String texto = "";

        for (String nombre: nombres) {
            texto = texto + nombre + " ";
        }

        System.out.println(texto);

    }


}
