package Ex5;

public class Triangle extends Shape{
    private int a;
    private int c;

    public Triangle(int a, int c){
        this.a = a;
        this.c = c;
    }

    public double Area(){
        return (a * c) / 2;
    }

    public double Perimeter(){
        return a+c + Math.sqrt((a*a) + (c*c));
    }
    
}
