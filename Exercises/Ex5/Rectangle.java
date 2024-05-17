package Ex5;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public double Area(){
        double result = this.width * this.height;
        return result;
    }

    public double Perimeter(){
        return ((2 * this.width) + (2 * this.height));
    }
}
