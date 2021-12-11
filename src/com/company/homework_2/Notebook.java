package com.company.homework_2;

import java.util.Objects;

public class Notebook {
    private int price;
    private int ram;
    private Manufacturer manufacturer;

    public Notebook(int price, int ram, Manufacturer manufacturer) {
        this.price = price;
        this.ram = ram;
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return price == notebook.price && ram == notebook.ram && manufacturer == notebook.manufacturer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, ram, manufacturer);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", ram=" + ram +
                ", manufacturer=" + manufacturer +
                '}';
    }

}
