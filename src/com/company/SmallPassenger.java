package com.company;

public class SmallPassenger extends PassengerCar implements IBuyingBookingCar{
    private String Carcase;
    private String DriveUnit;
    private String Wheel;

    public SmallPassenger(){}
    public SmallPassenger(String Name, long Price, String Color, int SumDoors, int SumPassenger, boolean isCommercial, String Carcase, String DriveUnit, String Wheel){
        //setName(Name);
        //setPrice(Price);
        this.Name = Name;
        this.Price = Price;
        this.Color = Color;
        this.SumDoors = SumDoors;
        this.SumPassenger = SumPassenger;
        this.isCommercial = isCommercial;
        this.Carcase = Carcase;
        this.DriveUnit = DriveUnit;
        this.Wheel = Wheel;
    }
    public String getCarcase(){
        return Carcase;
    }

    public void setCarcase(String carcase) {
        this.Carcase=Carcase;
    }

    public String getDriveUnit() {
        return DriveUnit;
    }

    public void setDriveUnit(String driveUnit) {
        this.DriveUnit=DriveUnit;
    }
    public String getWheel(){
        return Wheel;
    }

    public void setWheel(String wheel) {
        this.Wheel=Wheel;
    }

    public String ToString() {
        return super.ToString()+"Carcase: "+this.Carcase+ "DriveUnit: "+this.DriveUnit;
    }

    public String ToString2() {
        return "МалыйПассажирскийАвтомобиль\t" + Name + "\t" + Price + "\t" + Color + "\t" + SumDoors +"\t" + SumPassenger +"\t" + isCommercial+
                "\t" + Carcase + "\t" + DriveUnit + "\t" + Wheel;
    }

    public String getCarType(){
        return "Малый пассажирский автомобиль";
    }

    public long getHourPrice(){
        return Price / 20000;
    }
}
