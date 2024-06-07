package Exercises.Ex8;

public class Programm {
    public static void main(String[] args) {
        Lion mike = new Lion();
        Tiger sophie = new Tiger();
        Panther aileen = new Panther();

        mike.eat();
        sophie.eat();
        aileen.eat();

        mike.sound();
        sophie.sound();
        aileen.sound();
    }
}
