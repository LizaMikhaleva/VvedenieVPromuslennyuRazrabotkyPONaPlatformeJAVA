package com.company;

public abstract class Car implements IBuyingBookingCar {
    protected String Name;
    protected long Price;
    protected String Color;


    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name=Name;
    }
    public long getPrice() {
        return Price;
    }
    public void setPrice(long price) {
        this.Price=Price;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        this.Color=Color;
    }
    public String ToString() {
        return "Name: "+this.Name+ "Price: " +this.Price+ "Color: "+this.Color;

    }
}
