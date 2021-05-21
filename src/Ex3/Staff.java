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
public class Staff extends Employee {
    public String title;

    public Staff() {
    }

    public Staff(String title, String office, int salary, String name, String address, String phoneNumber, String emailAdd) {
        super(office, salary, name, address, phoneNumber, emailAdd);
        this.title = title;
    }

//getter,setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+"\nStaff{" + "title=" + title + '}';
    }
}
