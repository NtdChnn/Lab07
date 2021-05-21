/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

/**
 *
 * @author notda
 */
public class Preson {
    public String name;
    public String address;
    public String phoneNumber;
    public String email;
    
    Preson(){
    }
    
    Preson(String name, String address, String phoneNumber,String emailAdd){
    this.name = name;
    this.address  = address;
    this.phoneNumber = phoneNumber;
    this.email = emailAdd;
    }

//getter,setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNum) {
        this.phoneNumber = phoneNum;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String emailAdd) {
        this.email = emailAdd;
    }

    @Override
    public String toString() {
        return "Preson{" + "name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }
}
