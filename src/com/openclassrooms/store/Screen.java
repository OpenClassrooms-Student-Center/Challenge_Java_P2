package com.openclassrooms.store;

public class Screen extends Item {

    private String resolution;

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Screen(Brand brand, double price, String resolution) {
        super(brand, price);
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Screen{" + super.toString() +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
