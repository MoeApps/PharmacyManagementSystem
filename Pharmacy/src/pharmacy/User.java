/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

import java.util.Scanner;

/**
 *
 * @author mohamedalaa
 */
public class User {
    private String username;
    private  String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    
    public void Login(){
        Scanner s = new Scanner(System.in);
                Scanner n = new Scanner(System.in);

        System.out.println("Enter the Username ");
        String username = s.nextLine();
        System.out.println("Enter the password");
        String password = n.nextLine();
        if (s.equals(username) && n.equals(password)) {
         System.out.println("Login Succesful");   
        }else   System.out.println("Either username or password entered are incorrect, try again.");
        
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + '}';
    }
    
}
