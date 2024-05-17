package Ex5;

public class Programm {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 5);
        Circle circ = new Circle(5);
        Triangle tri = new Triangle(5, 5);

        System.out.println("Rectangle: ");
        System.out.printf("Area: %f\n", rect.Area());
        System.out.printf("Perimeter: %f\n", rect.Perimeter());

        System.out.println("Circle: ");
        System.out.printf("Area: %f\n", circ.Area());
        System.out.printf("Perimeter: %f\n", circ.Perimeter());

        System.out.println("Triangle: ");
        System.out.printf("Area: %f\n", tri.Area());
        System.out.printf("Perimeter: %f\n", tri.Perimeter());
    }
}
