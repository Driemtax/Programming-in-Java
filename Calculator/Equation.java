public class Equation {
    public double num1;
    public double num2;
    public char operator;
    public double result;
    public String errorMessage;

    public Equation(String expression){
        
        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '+':
                    num1 = Double.parseDouble(expression.substring(0, i));
                    num2 = Double.parseDouble(expression.substring(i+1, expression.length()));
                    result = Arithmetics.Addition(num1, num2);
                    break;
                default:
                    break;
            }
        }
    }
}
