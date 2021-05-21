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
public class Faculty extends Employee {
    public double officeHours;
    public String rank;

    public Faculty() {
    }
    
    public Faculty(double officeHours, String rank, String office, int salary, String name, String address, String phoneNumber, String emailAdd) {
        super(office, salary, name, address, phoneNumber, emailAdd);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
//getter,setter
    public double getOfficeHours() {
        return officeHours;
    }
    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFaculty{" + "officeHours=" + officeHours + ", rank=" + rank + '}';
    }
}
