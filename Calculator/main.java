import java.util.Scanner;

public class main {

    public static void main(String[] args){
        System.out.println("#########################################################");
        System.out.println("Welcome to the MAGA Calculator 3000!");
        System.out.println("#########################################################");

        Scanner inputObj = new Scanner(System.in);
        double result = 0;
        while (true) {
            System.out.println("Please enter your equation: ");

            String input = inputObj.nextLine();
            if (input.equals("q")) {
                break;
            }
            System.out.println("Input is: " + input);

            String resultExp = Equation.Parser(input);

            result = Double.parseDouble(resultExp);
            
            System.out.printf("Result: %f", result);
        }
        inputObj.close();
    }
}
