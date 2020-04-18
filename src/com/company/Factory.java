package com.company;

public class Factory {
    public IBuyingBookingCar getCurrentCar(String input) {
        IBuyingBookingCar car = null;
        if (input.equals("CargoCar") || input.equals("ГрузовойАвтомобиль")) {
            car = new CargoCar();
        } else if (input.equals("PassangerCar") || input.equals("ПассажирскийАвтомобиль")) {
            car = new PassengerCar();
        } else if (input.equals("SmallPassanger") || input.equals("МалыйПассажирскийАвтомобиль")) {
            car = new SmallPassenger();
        }
        return car;
    }
}