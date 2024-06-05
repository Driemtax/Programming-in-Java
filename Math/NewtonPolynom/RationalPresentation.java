package Math.NewtonPolynom;

import Math.Utility.*;

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
            String fractionalPart = sNumber.substring(sNumber.indexOf(".")+1);
            int numerator;
            if (HasPeriodicPattern(fractionalPart)) {
                numerator = NumeratorDivisor(Integer.parseInt(fractionalPart.substring(0, 2)));
            }
            else {
                numerator = NumeratorDivisor(Integer.parseInt(fractionalPart));
            }
            int denumerator = (int)(numerator/fNumber);

            fraction[0] = numerator;
            fraction[1] = denumerator;
        }

        fraction = ShortenFraction(fraction);
        

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

    // Method to check for periodic behaviour in a fractional number
    // public static boolean HasPeriodicPattern(String fractionalPart){
    //     for (int length = 1; length <= fractionalPart.length() / 2; length++) {
    //         String pattern = fractionalPart.substring(1, length+1);
    //         boolean isPattern = true;
            
    //         for (int i = length; i + length <= fractionalPart.length(); i += length) {
    //             if (!fractionalPart.substring(i, i + length).equals(pattern)) {
    //                 isPattern = false;
    //                 break;
    //             }
    //         }
            
    //         if (isPattern) {
    //             return true;
    //         }
    //     }
        
    //     return false;
    // }  

    public static boolean HasPeriodicPattern(String fractionalPart){
        if (fractionalPart.length() < 5) {
            return false;
        }
        for (int i = 0; i <= fractionalPart.length() / 2; i++) {
            String pattern = fractionalPart.substring(i, i+3);
            boolean isPattern = true;

            for (int j = i+3; j <= fractionalPart.length()-i-1; j++) {
                String comparePattern = fractionalPart.substring(j, j+i);
                if (!comparePattern.equals(pattern)) {
                    isPattern = false;
                    break;
                }
            }

            if (isPattern) {
                return true;
            }
        }

        return false;
    }
    
    //Method to shorten the Fraction as much as possible
    public static int[] ShortenFraction(int[] fraction){
        int numerator = fraction[0];
        int denumerator = fraction[1];
        int result[] = new int[2];
        
        int biggerNumber = (numerator > denumerator) ? numerator : denumerator;
        int smallerNumber = (numerator > denumerator) ? denumerator : numerator;

        if (biggerNumber % smallerNumber == 0) {
            int gcd = Helper.CGD(biggerNumber, smallerNumber);
            result[0] = numerator / gcd;
            result[1] = denumerator / gcd;
            
            return result;
        }
        else {
            result[0] = numerator;
            result[1] = denumerator;
            return result;
        }
    }
}