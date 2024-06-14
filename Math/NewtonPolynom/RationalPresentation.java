package Math.NewtonPolynom;

import Math.Utility.*;

public class RationalPresentation {
    public static int[] Fraction(double fNumber){
        String wnp;
        String fractionalPart;

        String sNumber = String.valueOf((float)fNumber);
        int divisor = 1;
        int fraction[] = new int[2];
        fraction[0] = 1;
        fraction[1] = divisor;

        //Check for E Numbers
        sNumber = ConvertENumber(sNumber);

        wnp = sNumber.substring(0, sNumber.indexOf("."));
        int number = Integer.parseInt(wnp);

        if (number >= 1 || number < 0) {
            int denumerator = NumeratorDivisor(number);
            int numerator = (int)(fNumber * denumerator);    

            fraction[0] = numerator;
            fraction[1] = denumerator;
        }
        else {
            fractionalPart = sNumber.substring(sNumber.indexOf(".")+1);
            int numerator;
            if (HasPeriodicPattern(fractionalPart)) {
                numerator = NumeratorDivisor(Integer.parseInt(fractionalPart.substring(0, 2)));
            }
            else {
                numerator = NumeratorDivisor(Integer.parseInt(fractionalPart));
            }
            int denumerator = (int)(numerator/fNumber);

            if(denumerator < 0 && numerator >= 0 || numerator < 0 && denumerator < 0){
                numerator *= -1;
                denumerator *= -1;
            }

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
            int gcd = Math.abs(Helper.CGD(biggerNumber, smallerNumber));
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

    public static String ConvertENumber(String fNumber){
        String result = "";
        int eIndex = 0;

        if (fNumber.contains("E")) {
            boolean negative = fNumber.charAt(0) == '-';
            eIndex = fNumber.indexOf("E");
            int eFactor = Integer.parseInt(fNumber.substring(eIndex + 2, eIndex + 3));

            result = (negative) ? "-0." : "0.";

            for (int i = 0; i < eFactor; i++) {
                result += "0";
            }

            fNumber = fNumber.replace(".", "");
            fNumber = fNumber.substring(0, eIndex-1);
            fNumber = (fNumber.contains("-")) ? fNumber.replace("-", "") : fNumber;

            result += fNumber;

            return result;
        }

        return fNumber;
    }
}