package models;

/**
 *
 * @author armando
 */
public class Provider {

    private int id;
    private String name;
    private String lastname;
    private String phone;
    private Product product;

    public Provider(int id, String name, String lastname, String phone, Product product) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.product = product;
    }

    public Provider(int id, String name, String lastname, String phone) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
