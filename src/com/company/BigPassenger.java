package com.company;

public class BigPassenger extends PassengerCar {
    private String Type;
    private String ApplicationArea;
    private String Dimensions;

    public BigPassenger(String Name, long Price, String Color, int SumDoors, int SumPassenger, boolean isCommercial, String Type, String ApplicationArea, String Dimensions) {
        super(Name, Price, Color, SumDoors, SumPassenger, isCommercial);
        setType(Type);
        setApplicationArea(ApplicationArea);
        setDimensions(Dimensions);
    }
    public String getType(){
        return Type;
    }

    public void setType(String type) {
        this.Type=Type;
    }

    public String getApplicationArea() {
        return ApplicationArea;
    }

    public void setApplicationArea(String applicationArea) {
        this.ApplicationArea=ApplicationArea;
    }

    public String getDimensions() {
        return Dimensions;
    }

    public void setDimensions(String dimensions) {
        this.Dimensions=Dimensions;
    }
}
