package com.company;

public class PassengerCar extends Car implements IBuyingBookingCar{

    protected int SumDoors;
    protected int SumPassenger;
    protected boolean isCommercial;

    public PassengerCar(){}
    public PassengerCar(String Name, long Price, String Color, int SumDoors, int SumPassenger, boolean isCommercial){
        this.Name = Name;
        this.Price = Price;
        this.Color = Color;
        setSumDoors(SumDoors);
        setSumPassenger(SumPassenger);
        setCommercial(isCommercial);
    }

    public int getSumDoors() {
        return SumDoors;
    }

    public void setSumDoors(int sumDoors) {
        this.SumDoors=SumDoors;
    }

    public int getSumPassenger() {
        return SumPassenger;
    }

    public void setSumPassenger(int sumPassenger) {
        this.SumPassenger=SumPassenger;
    }

    public boolean getCommercial() {
        return isCommercial;
    }

    public void setCommercial(boolean commercial) {
        this.isCommercial=isCommercial;
    }

    public String ToString() {
        return super.ToString()+"SumDoors: "+this.SumDoors+ "SumPassenger: "+this.SumPassenger + "isCommercial:" + this.isCommercial;
    }

    public String ToString2() {
        return "ПассажирскийАвтомобиль\t" + Name + "\t" + Price + "\t" + Color + "\t" + SumDoors +"\t" + SumPassenger +"\t" + isCommercial;
    }

    public String getCarType(){
        return "Пассажирский автомобиль";
    }

    public long getHourPrice(){
        return Price / 15000;
    }
}
