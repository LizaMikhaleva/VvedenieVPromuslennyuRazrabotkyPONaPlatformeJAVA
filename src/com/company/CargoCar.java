package com.company;

public class CargoCar extends Car implements IBuyingBookingCar{
    protected int Carrying;
    protected String Clas;
    protected String LastName;

    public CargoCar(){}
    public CargoCar (String Name, long Price, String Color, int Carrying, String Clas, String LastName){
        this.Name = Name;
        this.Price = Price;
        this.Color = Color;
        this.Carrying = Carrying;
        this.Clas = Clas;
        this.LastName  =LastName;
    }

    public String ToString2() {
        return "ГрузовойАвтомобиль\t" + Name + "\t" + Price + "\t" + Color + "\t" + Carrying + "\t" + Clas +"\t" + LastName;
    }

    public int getCarrying() {
        return Carrying;
    }

    public void setCarrying(int carrying) {
        Carrying = this.Carrying;
    }
    public String getClas(){
        return Clas;
    }

    public void setClas(String Clas) {
        Clas = this.Clas;
    }
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = this.LastName;
    }

    public String getCarType(){
        return "Грузовой автомобиль";
    }

    public long getHourPrice(){
        return Price / 30000;
    }
}
