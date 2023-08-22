/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

/**
 *
 * @author mohamedalaa
 */
public class Medicine{
  
    private String name;
    private String expDate;
    private double price;
    private int quantity;
    
    
    public Medicine() {
    }

    public Medicine(String name, String expDate, int quantity, double price) {
        this.name = name;
        this.expDate = expDate;
        this.quantity = quantity;
        this.price = price;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
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

    public void addMed(int quantity){
        this.quantity += quantity;
        System.out.println("Medicine added!");
    }
    public void removeMed(int quantity){
        if (this.quantity < quantity) {
            System.out.println("Not enough medicine in stock");
        }else 
        this.quantity -= quantity; System.out.println("Medicine removed!");
    }
    public void updateMed(double price, String expdate){
     this.expDate = expdate;
     this.price = price;
        System.out.println("Medicine details updated succesfuly!");
    }
    
    @Override
    public String toString() {
        return "Medicine{" + "name=" + name + ", expDate=" + expDate + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
    
    
}
