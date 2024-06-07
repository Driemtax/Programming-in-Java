import java.util.HashMap;

public class Equation {
    public static String Parser(String expression){ //expression = 3 * (4 + (24*3)) 
        //Über Funktion gehen und nach Klammern suchen
        if (!(expression.contains("("))) {
            expression = expression.concat(Double.toString(Calculate(expression)));
            return expression;
        }
        int startBracket = 0;
        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '(':
                    startBracket = i+1;
                    break;
                case ')':
                    expression = Parser(expression.substring(startBracket, i)); 
                                                                        //expression2 = 4 + (24*3)
                                                                        // expression3 = 24*3 = 72
                                                                        // expression2 = 4 + 72 = 76
                                                                        //expression1 = 3 * 76 = 228
                    break;
            }
        }
        return expression;
    }

    public static double Calculate(String expression){
        double result = 0;
        int indexLastOperator = 0;
        char lastOperator = '\0';

        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '*':
                    break;
                case '/':
                    break;
                case '+':
                    if (lastOperator == '\0') {
                        lastOperator = '+';
                        indexLastOperator = i;
                        break;
                    }
                    break;
                case '-':
                    break;
            }
        }

        return result;
    }

    public static Double Solve(String expression, HashMap<Integer, Character> operators){
        Double result = 0.0;

        while (operators.values().contains('*') | operators.values().contains('/')) {
            
        }

        return result;
    }

    

    public static HashMap<Integer, Character> FindOperators(String expression){
        HashMap<Integer, Character> operators = new HashMap<Integer, Character>();

        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '+':
                    operators.put(i, '+');
                    break;
                case '-':
                    operators.put(i, '-');
                    break;
                case '*': 
                    operators.put(i, '*');
                    break;
                case '/':
                    operators.put(i, '/');
                    break;
            }
        }

        return operators;
    }
}
