public class RationalPresentation {
    public static int[] Fraction(double fNumber){
        String number = String.valueOf(fNumber);
        int divisor = 1;
        int fraction[] = new int[2];
        fraction[0] = 1;
        fraction[1] = divisor;

        number = number.replaceAll("0", "");
        number = number.replace(".", "");

        int numerator = Integer.parseInt(number);
        int biggestNumerator = NumeratorDivisor(numerator);

        return fraction;

    }

    public static int NumeratorDivisor(int numerator){
        for (int i = numerator-1; i >= 0; i--) {
            if (numerator % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
