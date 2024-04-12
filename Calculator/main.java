import java.util.Scanner;

public class main {

    public static void main(String[] args){
        System.out.println("#########################################################");
        System.out.println("Welcome to the MAGA Calculator 3000!");
        System.out.println("#########################################################");

        Scanner inputObj = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your equation: ");

            String input = inputObj.nextLine();
            if (input.equals("q")) {
                break;
            }
            System.out.println("Input is: " + input);
            Equation expression = new Equation(input);
            System.out.printf("Result: %f", expression.result);
        }
        inputObj.close();
    }
}
