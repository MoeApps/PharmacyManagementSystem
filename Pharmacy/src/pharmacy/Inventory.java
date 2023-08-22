/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mohamedalaa
 */
public class Inventory{
    String name;
    int quantity;
    private ArrayList<Medicine> medicines = new ArrayList<>();

    public Inventory(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.medicines = new ArrayList<>();
    }
    
    
    public void addMed(Medicine medicine){
        this.medicines.add(medicine);
        System.out.println("Medicine " + medicine + " has been Added to the inventory succesfully.");
    }
    public void removeMed(Medicine medicine){
        this.medicines.remove(medicine);
        System.out.println("Medicine " + medicine + " has been Removed from the inventory succesfully.");
        
    }
    public Medicine searchMed(String name){
        for (Medicine med : this.medicines) {
            if (med.getName().equalsIgnoreCase(name)) {
                return med;
            }else System.out.println("Couldn't find a medicine with the name you entered");
        }
        return null;
    }
    
    public void updateStock(Medicine medicine, int quantity){
        int currentStock = medicine.getQuantity();
        if (currentStock >= quantity) {
            medicine.setQuantity(currentStock - quantity);
        }else System.out.println("Insufficient Stock");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Inventory{");
        sb.append("name=").append(name);
        sb.append(", quantity=").append(quantity);
        sb.append(", medicines=").append(medicines);
        sb.append('}');
        return sb.toString();
    }
    
}
