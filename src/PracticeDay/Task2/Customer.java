package PracticeDay.Task2;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
    private Long id;
    private int incrementedId = 0;
    private String firstName;
    private String email;
    private LocalDate dateOfBirth;
    private int phoneNumber;
    private Customer[] customers = new Customer[0];


    public Customer() {
        incrementedId++;
    }

    public Customer(Long id, String firstName, String email, LocalDate dateOfBirth, int phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        incrementedId++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String createCustomer(Customer customer){
        customers = Arrays.copyOf(customers, customers.length + 1);
        customers[customers.length - 1] = customer;
        return "Successfully created!";
    }
    public Customer[] getAllCustomers(){
        return customers;
    }

    public Customer getByIdCustomer(long id){
        for (Customer customer : customers) {
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }
    public String updateCustomer(long id, Customer customer){
        Customer newCustomer = null;
        for (int i = 0; i < incrementedId; i++) {
            if(customers[i].getId() == id){
                newCustomer = customers[i];
                break;
            }
        }
        if(newCustomer != null){
            newCustomer.setId(customer.getId());
            newCustomer.setEmail(customer.getEmail());
            newCustomer.setDateOfBirth(customer.getDateOfBirth());
            newCustomer.setPhoneNumber(customer.getPhoneNumber());
            newCustomer.setFirstName(customer.getFirstName());
            return "Customer updated!";
        }else{
            return "Can't find this id: " + id;
        }
    }

    public void deleteCustomer(long id){
        boolean findCustomer = false;
        for (int i = 0; i < incrementedId; i++) {
            if(customers[i].getId() == id){
                findCustomer = true;
                for (int j = 0; j < incrementedId - 1; j++) {
                    customers[j] = customers[j + 1];
                }
                incrementedId--;
            }
        }
        customers = Arrays.copyOf(customers, customers.length - 1);
    }
}
