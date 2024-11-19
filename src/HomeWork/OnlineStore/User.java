package HomeWork.OnlineStore;

import java.util.Arrays;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int password;
    private Product[] products;
    private User[] users = new User[4];
    private int size = 0;

    public User() {
    }

    public User(String firstName, String lastName, String email, int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String add(User user){
        users = Arrays.copyOf(users, size + 1);
        users[size] = user;
        return "Successfully saved student!";
    }
    public Product[] getAll(){
        return products;
    }



}
