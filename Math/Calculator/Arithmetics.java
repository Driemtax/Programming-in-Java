public class Arithmetics {
    public static double Addition(double summand1, double summnand2){
        return summand1 + summnand2;
    }

    public static double Subtraction(double minuend, double subtrahend){
        return minuend - subtrahend;
    }

    public static double Multiplication(double factor1, double factor2){
        return factor1 * factor2;
    }

    public static double Division(double dividend, double divisor){
        try {
            return dividend / divisor;
        } catch (Exception e) {
            throw new Error(e.toString());
        }
    }
}
