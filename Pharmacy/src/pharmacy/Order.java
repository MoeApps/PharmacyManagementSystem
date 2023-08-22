/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mohamedalaa
 */
public class Order {
    private int ordernumber = 0;
    private Customer customer;
    private Employee employee;
    ArrayList<Medicine> items;
    private double totalCost;
    private String paymentMethod;
    private LocalDate orderDate;
    private int custID;
    
    
    

    public Order(){
        ordernumber++;
    }

    public Order(int ordernumber, Customer customer, Employee employee, String paymentMethod) {
        this.ordernumber = ordernumber;
        this.customer = customer;
        this.employee = employee;
        this.items = new ArrayList<Medicine>();
        this.totalCost = 0.0;
        this.paymentMethod = paymentMethod;
    }
    
    public static Order createOrder(Customer customer){
        return new Order();
    }

    public void addItem(Medicine item) {
        items.add(item);
    }
    public void removeItem(Medicine item){
        if (items.contains(item)) {
                items.remove(item);
        }else {
            System.out.println("Item not found in order basket, try again. ");   
        }
            
    }
    
    public void processOrder(){ // update inventory
     for(Medicine item: items){   
      item.setQuantity(item.getQuantity() - 1);
     }
     
    }
    
    public double calcTotalCost(){
        double cost = 0.0;
        for(Medicine item : items){
         cost += item.getPrice();
        }
        totalCost = cost;
        return cost;
    }

    public void generateReceipt(){
        System.out.println("Order number: " + ordernumber);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Employee: " + employee.getName());
        System.out.println("Payment method: " + paymentMethod.toString());
        System.out.println("Items: ");
        for(Medicine item : items){
            System.out.println(item.getName() + " - $" + item.getPrice());   
        }
        System.out.println("Total cost: $" + totalCost);
    }

    public int getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ArrayList<Medicine> getItems() {
        return items;
    }

    public void setItems(ArrayList<Medicine> items) {
        this.items = items;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order{");
        sb.append("ordernumber=").append(ordernumber);
        sb.append(", customer=").append(customer);
        sb.append(", employee=").append(employee);
        sb.append(", items=").append(items);
        sb.append(", totalCost=").append(totalCost);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", custID=").append(custID);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
