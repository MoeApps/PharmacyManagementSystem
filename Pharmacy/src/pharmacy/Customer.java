/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohamedalaa
 */
public class Customer extends User{
    private final int custID;
    private String name;
    private int phoneNumber;
    private String address;
    private List<Order> orders;

    public Customer(int custID,String name, int phoneNumber, String address) {
        this.name = name;
        this.custID = custID;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public List<Order> viewOrderHistory(int custID){ // retrieves all the orders for a specific customer
        System.out.println("Generating the order history for customer id: " + custID);
        ArrayList<Order> customerOrders = new ArrayList<>();
        for(Order order : this.orders){
            if (order.getCustID() == custID) {
                customerOrders.add(order);
            }
   
        }
        System.out.println("Here's the order history for Customer: " + custID); return customerOrders;
    }

    @Override
    public String toString() {
        return "Customer{" + "custID=" + custID + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + ", orders=" + orders + '}';
    }
    


}
