package com.ejercicios.poo;

public class Main {
    public static void main(String[] args) {
        SmartDevice dispositivo = new SmartDevice("smart-device","0000000000000001",
                "Samsung","Modelo1","SNumber");

        SmartPhone telefono = new SmartPhone("smart-phone","0000000000000001", "Samsung","Galaxy S20","ASD000","IM002");
        SmartWatch reloj = new SmartWatch("smart-watch", "0000000000000002", "Samsung","Galaxy Watch 5","DEF0003","BsAs/Argentina");

        System.out.println("SmartDevice"+ dispositivo);
        System.out.println("SmartPhone"+ telefono);
        System.out.println("SmartWatch"+ reloj);


    }
}
