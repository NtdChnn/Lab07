/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author notda
 */
public class Circle extends Geometric {
    private double radius;

    //default constructor - no-arg #hidden, compile generate automatically

    public Circle() { // progammer created <- auto default disappear
        //implicitly call superclass's constructor #hidden
        //super(); #hidden = Geometric(); //JVM
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color); //call superclass's construct
        // cannot call by name, must use keyword "super"
        // therefore,call superclass's construct frist stament in own constructor
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return super.toString()+" Circle{" + "radius=" + radius + '}';
    }

}
