/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

/**
 *
 * @author mohamedalaa
 */
public abstract class Product {
    private String name;
    String description;
    private double price;
    private int stockLevel;

    public Product(String name, String description, double price, int stockLevel) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockLevel = stockLevel;
    }

    public Product() {
    }

    public abstract String getProductType();
    
    public void addToStock(int quantity){
        this.stockLevel += quantity;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", description=" + description + ", price=" + price + ", stockLevel=" + stockLevel + '}';
    }
    
}
