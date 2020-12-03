package com.company;

public class House {
    private static int counter = 1;
    private int id, FlatNum, area, floor, NumOfBedrooms;
    private String street;

    public House(int FlatNum, int area, int floor, int NumOfBedrooms, String street){
        this.id = counter;
        this.FlatNum = FlatNum;
        this.area = area;
        this.floor = floor;
        this.NumOfBedrooms = NumOfBedrooms;
        this.street = street;
        counter++;
    }
    public int getId() {
        return id;
    }

    public int getFlatNumber() {
        return FlatNum;
    }

    public int getArea() {
        return area;
    }

    public int getFloor() {
        return floor;
    }

    public int getNumOfBedrooms() {
        return NumOfBedrooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String newStreet) {
        street = newStreet;
    }

    public String toString() {
        return "ID " + id
                + "\t\tFlat number: " + FlatNum
                + "\t\tArea: " + area
                + "\t\tFloor: " + floor
                + "\t\tNumber of bedrooms: " + NumOfBedrooms
                + "\t\tStreet: " + street;
    }
}
