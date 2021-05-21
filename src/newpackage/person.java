/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author notda
 */
public class person {
    String name;

    public person() {
    }

    public person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
    
}
class student extends person{
    int id;

    public student() {
    }

    public student(int id) {
        this.id = id;
    }

    public student(int id, String name) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString()+"/nStudent{" + "id=" + id + '}';
    }
    
    
}
class faculty extends person{
    String title;

    public faculty() {
    }

    public faculty(String title) {
        this.title = title;
    }

    public faculty(String title, String name) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+"/nFaculty{" + "title=" + title + '}';
    }
    
    
}