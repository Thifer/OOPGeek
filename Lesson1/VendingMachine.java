package Lesson1;

import Home1.Chocolate;

import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (((BottleOfWater)product).getVolume()  == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }
    public Chocolate getChocolade(double price){
        for (Product product : products){
            if (product instanceof Chocolate){
                if (((Chocolate)product).getPrice()  == price){
                    return (Chocolate)product;
                }
            }
        }
        return null;
    }
}
