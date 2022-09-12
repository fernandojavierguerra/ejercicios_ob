package com.ejercicios.nros789;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        String textoAlReves = new String();
        textoAlReves = reverse("Hola Mundo");
        System.out.println(textoAlReves);
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio5();
        ejercicio6();

        try {
            System.out.println("Division de dos numeros: " + dividePorCero_ej7(5, 0));

        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

    }

    public static String reverse(String texto) {
        String result = new String();
        for (int i = texto.length() - 1; i >= 0; i--) {
            result = result + texto.charAt(i);
        }
        return result;
    }

    public static void ejercicio1() {
        String[] textos = new String[]{"p1", "p2", "p3", "p4", "p5"};
        for (String texto : textos) {
            System.out.println(texto);
        }
    }

    public static void ejercicio2() {
        String[][] textos = {
                {"p11", "p12", "p13", "p14"},
                {"p21", "p22", "p23", "p24"}
        };

        for (int i = 0; i < textos.length; i++) {
            for (int j = 0; j < textos[i].length; j++) {
                System.out.println("Posicion: i: " + i + " j: " + j);
                System.out.println("Valor :" + textos[i][j]);
            }
        }

    }

    public static void ejercicio3() {
        Vector<String> v = new Vector<String>();
        v.add("Cadena1");
        v.add("Cadena2");
        v.add("Cadena3");
        v.add("Cadena4");
        v.add("Cadena5");

        System.out.println(v.toString());

        v.remove("Cadena2");
        v.remove("Cadena3");

        System.out.println(v.toString());
    }

    public static void ejercicio5() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Cadena1");
        arrayList.add("Cadena2");
        arrayList.add("Cadena3");
        arrayList.add("Cadena4");

        LinkedList<String> linkedList = new LinkedList<String>();
        for (String s : arrayList) {
            linkedList.add(s);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " - ");
            System.out.println(linkedList.get(i));
        }
    }

    public static void ejercicio6() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 1; i < 11; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList.toString());

        Iterator it = arrayList.iterator();

        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            if (i % 2 == 0)
                it.remove();
        }

        System.out.println(arrayList.toString());

    }

    public static int dividePorCero_ej7(int a, int b) throws Exception {
        int resultado = 0;
        try {
            resultado = (a / b);
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado;

    }




}
