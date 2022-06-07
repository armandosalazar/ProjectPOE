package models;

/**
 *
 * @author armando
 */
public class User {

    private int id;
    private String name;
    private String lastname;
    private String phone;
    private String type;

    public User(int id, String name, String lastname, String phone, String type) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
