package Lesson6.srp2;

public class Order {

    private final Client client;

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    private final Product product;

    public Order(){
        this.client = new Client();
        this.product = new Product();
    }

    public Order(String clientName, String productName, int qnt, int price) {
        client = new Client(clientName);
        product = new Product(productName,qnt,price);

    }

    public void saveToJson() {
        JsonSaver.saveToJson(this);
    }


}
