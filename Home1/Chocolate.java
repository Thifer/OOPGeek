package Home1;

import Lesson1.Product;

public class Chocolate extends Product {

    private double volume; // объем
    private int cocoaСontent; // Содержание жирности

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCocoaСontent() {
        return cocoaСontent;
    }

    public void setCocoaСontent(int cocoaСontent) {
        this.cocoaСontent = cocoaСontent;
    }

    public Chocolate(String brand, String name, double price, double volume, int cocoaСontent) {
        super(brand, name, price);
        this.volume = volume;
        this.cocoaСontent = cocoaСontent;
    }

    @Override
    public String displayInfo() {
        return String.format("[Плитка]%s - %s - %f - [объем: %f; горькость: %d]", brand, name, price, volume, cocoaСontent);
    }
}
