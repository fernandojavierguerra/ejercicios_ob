package com.ejercicios.poo;

public class SmartDevice {
    private String name;
    private String address;
    private String manufacturer;
    private String model;
    private String serialNumber;

    public SmartDevice() {
    }

    public SmartDevice(String name, String address, String manufacturer, String model, String serialNumber) {
        this.setName(name);
        this.setAddress(address);
        this.setManufacturer(manufacturer);
        this.setModel(model);
        this.setSerialNumber(serialNumber);
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
