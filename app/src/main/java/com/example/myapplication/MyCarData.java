package com.example.myapplication;

public class MyCarData {
    private String brand;
    private String car;
    private String year;
    private int image;

    public MyCarData(String brand, String car, String year, int image) {
        this.brand = brand;
        this.car = car;
        this.year = year;
        this.image = image;
    }

    public MyCarData() {
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
