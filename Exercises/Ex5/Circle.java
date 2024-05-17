package Ex5;
import java.math.*;

public class Circle extends Shape{
    private int radius;
    private int diameter;

    public Circle(int radius){
        this.radius = radius;
        this.diameter = 2 * radius;
    }

    public double Area(){
        return Math.PI * (radius * radius);
    }

    public double Perimeter(){
        return 2 * Math.PI * radius;
    }
    
}
