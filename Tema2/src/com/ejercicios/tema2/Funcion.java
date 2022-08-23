package com.ejercicios.tema2;

public class Funcion {

    public static void main(String[] args) {
        /*
        * Funcion para calcular el IVA
        * */

        double precio = 54.33d;

        System.out.println("Caluculo el IVA de: " + precio);
        System.out.println("precio con IVA :" + calcularIVA(precio));

    }

    static double calcularIVA(double precio) {
        return precio * 1.21;
    }

}
