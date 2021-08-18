
package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int User_id;
    private String User_name,email,password,contact,role;
    private boolean active;

    public User() {
    }

    public User(int User_id, String User_name, String email,String password,String contact ,String role) {
        this.User_id = User_id;
        this.User_name = User_name;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.role = role;
        this.active = false;
    }

    
    public void setUser_id(int User_id) {
        this.User_id = User_id;
    }

    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }

    public int getUser_id() {
        return User_id;
    }

    public String getUser_name() {
        return User_name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "User{" + "User_id=" + User_id + ", User_name=" + User_name + ", email=" + email + ", contact=" + contact + ", password=" + password + ", role=" + role + ", active=" + active + '}';
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUser_Name() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
