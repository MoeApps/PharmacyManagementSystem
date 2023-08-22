/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

/**
 *
 * @author mohamedalaa
 */
public class Employee {
    private String name;
    private int id;
    private String role;
    private int phoneNumber;
    private int salary;

    public Employee(String name, String role, int phoneNumber, int salary, int id) {
        this.name = name;
        this.role = role;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.id = id;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setId(int id){
     this.id = id;   
    }
    public int getId(){
     return id;   
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("name=").append(name);
        sb.append(", role=").append(role);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
    
    
}
