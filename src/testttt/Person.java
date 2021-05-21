/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testttt;

public class Person {
  
    String name;

    public Person() {
    }
    
    

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
    
    

   
    
    
    
}
class Student extends Person{
    int id;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" + "id=" + id + '}';
    }
    
    


    

   
    
   
    
    
}
class Faculty extends Person{
    String title;

    public Faculty() {
    }

    public Faculty(String title) {
        this.title = title;
    }

    public Faculty(String title, String name) {
        super(name);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+ "Faculty{" + "title=" + title + '}';
    }

    
    
    
    
}
