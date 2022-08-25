package com.ejercicios.poo;

public class SmartWatch extends SmartDevice {
    private String timeZone;

    public SmartWatch() {
    }

    public SmartWatch(String name, String address, String manufacturer, String model, String serialNumber, String timeZone) {
        super(name, address, manufacturer, model, serialNumber);
        this.setTimeZone(timeZone);

    }

    ;

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                super.toString() + ", " +
                "timeZone='" + timeZone + '\'' +

                '}';
    }
}
