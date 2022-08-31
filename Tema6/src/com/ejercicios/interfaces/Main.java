package com.ejercicios.interfaces;

public class Main {
    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        System.out.println(cocheCRUD.delete());
        System.out.println(cocheCRUD.save());
        System.out.println(cocheCRUD.findAll());

    }
}
