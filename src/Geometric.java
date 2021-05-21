
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author notda
 */
public class Geometric {
    private String color;
    private Date dateCreated;

    public Geometric() {
        dateCreated = new Date();
    }
    
    public Geometric(String color){
        this.color = color;
        dateCreated = new Date();
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Geometric{" + "color=" + color + ", dateCreated=" + dateCreated + '}';
    }

}
