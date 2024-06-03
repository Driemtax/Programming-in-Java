public class RationalPresentation {
    public static int[] Fraction(double fNumber){
        String sNumber = String.valueOf(fNumber);
        int divisor = 1;
        int fraction[] = new int[2];
        fraction[0] = 1;
        fraction[1] = divisor;

        String wnp = sNumber.substring(0, sNumber.indexOf("."));
        int number = Integer.parseInt(wnp);

        if (number >= 1 || number < 0) {
            int denumerator = NumeratorDivisor(number);
            int numerator = (int)(fNumber * denumerator);    

            fraction[0] = numerator;
            fraction[1] = denumerator;
        }
        else {
            int numerator = NumeratorDivisor(Integer.parseInt(sNumber.substring(sNumber.indexOf(".")+1)));
            int denumerator = (int)(numerator/fNumber);

            fraction[0] = numerator;
            fraction[1] = denumerator;
        }
        

        return fraction;

    }

    public static int NumeratorDivisor(int numerator){
        for (int i = 2; i <= numerator; i++) {
            if (numerator % i == 0) {
                return i;
            }
        }
        return 2;
    }
}
