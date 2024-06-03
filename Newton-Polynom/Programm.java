import java.util.HashMap;

public class Programm {
    public static void main(String args[]){
        HashMap<Integer, Double> data = new HashMap<Integer, Double>();
        data.put(-1,0.0);
        data.put(1,3.0);
        data.put(2,5.0);
        data.put(3, 4.0);


        String polynom = NewtonPolynom.CreatePolynom(data);

        System.out.printf("f(x)= %s\n", polynom);

        int[] test = RationalPresentation.Fraction(-4.5);

        System.out.printf("Fraction of %f: %d/%d", 4.5, test[0], test[1]);
    }
}