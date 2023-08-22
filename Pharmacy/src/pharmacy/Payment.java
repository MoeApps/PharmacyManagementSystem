/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;
import java.util.Date;
/**
 *
 * @author mohamedalaa
 */
public class Payment {
    private double amount;
    private String method;
    private Date date;

    public Payment(double amount, String method, Date date) {
        this.amount = amount;
        this.method = method;
        this.date = date;
    }

    public Payment() {
    }

    public void payment(){
        System.out.println("");   
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Payment{");
        sb.append("amount=").append(amount);
        sb.append(", method=").append(method);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
    
    
}
