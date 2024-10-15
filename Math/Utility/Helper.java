package Math.Utility;

public class Helper {
    // Uncomment to use CGD as single programm
    /*public static void main(String[] args) {
        while (true) {
            System.out.println("\n");
            System.out.println("Welcome to the jungle!");
            System.out.println("Type in n: ");
            int n = Integer.parseInt(System.console().readLine());
            System.out.println("Type in m: ");
            int m = Integer.parseInt(System.console().readLine());

            int biggerNumber = n >= m ? n : m;
            int smallerNumber = n < m ? n : m;
            int result = CGD(biggerNumber, smallerNumber);

            System.out.println("Result: " + result);
        }
    }*/

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
