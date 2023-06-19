package Lesson6.srp2;

public class Product {
    private final String product;
    private final int qnt;
    private final int price;

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public Product(String product, int qnt, int price) {
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public Product(){
        this.product = WorkWithConsole.inputFromConsole("Product Name: ");
        this.qnt = Integer.parseInt(WorkWithConsole.inputFromConsole("Qnt :"));
        this.price = Integer.parseInt(WorkWithConsole.inputFromConsole("Price: "));
    }
}
