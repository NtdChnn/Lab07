/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

import java.util.Date;

/**
 *
 * @author notda
 */
public class Employee extends Preson {
    public String office;
    public int salary;
    private Date dateHired;

    public Employee() {
        dateHired = new Date();
    }

    public Employee(String office, int salary, String name, String address, String phoneNumber, String emailAdd) {
        super(name, address, phoneNumber, emailAdd);
        this.office = office;
        this.salary = salary;
        dateHired = new Date();
    }

//getter,setter
    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Date getDateHired() {
        return dateHired;
    }
    

    @Override
    public String toString() {
        return super.toString()+"\nEmployee{" + "office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + '}';
    }
    
    
}
