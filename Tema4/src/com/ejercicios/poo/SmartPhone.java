package com.ejercicios.poo;

public class SmartPhone extends SmartDevice {
    private String imei;

    public SmartPhone() {
    }

    public SmartPhone(String name, String address, String manufacturer, String model, String serialNumber, String imei) {
        super(name, address, manufacturer, model, serialNumber);
        this.setImei(imei);
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                super.toString() + ", " +
                "imei='" + imei + '\'' +

                '}';
    }
}
