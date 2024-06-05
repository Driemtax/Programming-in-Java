package Math.Utility;

public class Helper {
    /*Method to calculate the common greatest divisor of 2 numbers with euklidian algorithm
    Formula is m = q1 * n + b1 where m is the bigger number and n the smaller. 
    Final n is the gcd of m and n*/
    public static int CGD(int biggerNumber, int smallerNumber){
        int m, n, q, b;
        m = biggerNumber;
        n = smallerNumber;

        b = m % n;
        q = (m-b) / n;
        while (b > 0){
            m = n;
            n = b;
            b = m % n;
            q = (m-b) / n;
            
        }
        
        return n;
    }
}
