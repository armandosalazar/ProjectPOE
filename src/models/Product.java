package models;

/**
 *
 * @author armando
 */
public class Product {

    private int id;
    private String name;
    private double price;
    private int quantity;
    private Provider provider;

    private Product next;

    public Product(int id, String name, double price, int quantity, Provider provider) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.provider = provider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Product getNext() {
        return next;
    }

    public void setNext(Product next) {
        this.next = next;
    }
}
