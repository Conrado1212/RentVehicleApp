package pl.edu.wszib.model;

import java.awt.*;

public class Vehicle {
    private int idVehicle;
    private int idGroupVehicle;
    private char brand;
    private char model;
    private int maxRange;
    private int weight;
    private double pricePerSale;
    private int maxSpeed;
    private Point locationVehicle;
    private String nameLocation;
    private Polygon borderVehicle;

    public Vehicle(int idVehicle, int idGroupVehicle, char brand, char model, int maxRange, int weight, double pricePerSale, int maxSpeed, Point locationVehicle, String nameLocation, Polygon borderVehicle) {
        this.idVehicle = idVehicle;
        this.idGroupVehicle = idGroupVehicle;
        this.brand = brand;
        this.model = model;
        this.maxRange = maxRange;
        this.weight = weight;
        this.pricePerSale = pricePerSale;
        this.maxSpeed = maxSpeed;
        this.locationVehicle = locationVehicle;
        this.nameLocation = nameLocation;
        this.borderVehicle = borderVehicle;
    }

    public int getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(int idVehicle) {
        this.idVehicle = idVehicle;
    }

    public int getIdGroupVehicle() {
        return idGroupVehicle;
    }

    public void setIdGroupVehicle(int idGroupVehicle) {
        this.idGroupVehicle = idGroupVehicle;
    }

    public char getBrand() {
        return brand;
    }

    public void setBrand(char brand) {
        this.brand = brand;
    }

    public char getModel() {
        return model;
    }

    public void setModel(char model) {
        this.model = model;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPricePerSale() {
        return pricePerSale;
    }

    public void setPricePerSale(double pricePerSale) {
        this.pricePerSale = pricePerSale;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Point getLocationVehicle() {
        return locationVehicle;
    }

    public void setLocationVehicle(Point locationVehicle) {
        this.locationVehicle = locationVehicle;
    }

    public String getNameLocation() {
        return nameLocation;
    }

    public void setNameLocation(String nameLocation) {
        this.nameLocation = nameLocation;
    }

    public Polygon getBorderVehicle() {
        return borderVehicle;
    }

    public void setBorderVehicle(Polygon borderVehicle) {
        this.borderVehicle = borderVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "idVehicle=" + idVehicle +
                ", idGroupVehicle=" + idGroupVehicle +
                ", brand=" + brand +
                ", model=" + model +
                ", maxRange=" + maxRange +
                ", weight=" + weight +
                ", pricePerSale=" + pricePerSale +
                ", maxSpeed=" + maxSpeed +
                ", locationVehicle=" + locationVehicle +
                ", nameLocation='" + nameLocation + '\'' +
                ", borderVehicle=" + borderVehicle +
                '}';
    }
}
