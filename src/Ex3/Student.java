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
public class Student extends Preson {
    private int status;
    public final int FRESHMAN = 1;
    public final int SOPHOMORE = 2;
    public final int JUNIOR = 3;
    public final int SENIOR = 4;

    public Student() {
    }

    public Student(int status) {
        this.status = status;
    }

    public Student(int status, String name, String address, String phoneNumber, String emailAdd) {
        super(name, address, phoneNumber, emailAdd);
        this.status = status;
    }

//getter,setter
    public void setStatus(int status) {
        this.status = status;
    }   
    public String getStatus() {
        return switch (status) {
            case 1 -> "Freshman";
            case 2 -> "Sophomore";
            case 3 -> "Junior";
            case 4 -> "Senior";
            default -> "Unknown";
        };
    }

    @Override
    public String toString() {
        return super.toString()+"\nStudent{" + "status=" + status + '}';
    }    
}
