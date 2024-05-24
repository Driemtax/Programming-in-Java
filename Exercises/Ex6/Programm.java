package Ex6;

public class Programm {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("LH319", "Lissabon", "16:30");
        Airplane plane2 = new Airplane("MH370", "Singapore", "14:00");

        plane1.checkStatus();
        plane2.checkStatus();
    }
}
