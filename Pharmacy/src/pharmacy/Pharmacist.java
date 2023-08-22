/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

/**
 *
 * @author mohamedalaa
 */
public class Pharmacist extends Employee{
    private String eNumber;
    private int phSalary = 500;

    public Pharmacist(String eNumber, String name, String role, int phoneNumber, int salary, int id) {
        super(name, "Pharmacist", phoneNumber, salary, id);
        this.eNumber = eNumber;
    }

    Pharmacist() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String geteNumber() {
        return eNumber;
    }

    public void seteNumber(String eNumber) {
        this.eNumber = eNumber;
    }
    public double calculatePay(){
        return super.getSalary() + phSalary;
    }

    @Override
    public String toString() {
        return "Pharmacist{" + "eNumber=" + eNumber + ", phSalary=" + phSalary + '}';
    }
    
}
