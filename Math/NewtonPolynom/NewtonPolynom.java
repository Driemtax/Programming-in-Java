package Math.NewtonPolynom;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

public class NewtonPolynom {
    public static String CreatePolynom(HashMap<Integer, Double> data){
        String result = "";

        Object firstKey = data.keySet().toArray()[0];
        String p0 = data.get(firstKey).toString();
        result += p0;

        double[] differences = DivisionDifferences(data);
        int count = 1;
        for (double i : differences) {
            result += "+";
            String p_i;
            if (i % 1 == 0) {
                p_i = Double.toString(i);       
            }
            else {
                int fraction[] = RationalPresentation.Fraction(i);
                p_i = Integer.toString(fraction[0]);
                p_i += "/" + Integer.toString(fraction[1]);
            }
            result += p_i;
            for (int j = 0; j < count; j++) {
                String x_i = data.keySet().toArray()[j].toString();
                String x = "(x-" + x_i + ")";
                result += x;
            }
            count++;
        }


        return result;
    }

    public static double[] DivisionDifferences(HashMap<Integer, Double> data){
        double[] result = new double[data.size() - 1];
        List<Integer> keys = new ArrayList<>(data.keySet());

        for (int i = 0; i < keys.size()-1; i++) {
            result[i] = DifferenceRecursive(data, 0, i+1);
        }

        return result;
    }

    public static double DifferenceRecursive(HashMap<Integer, Double> data,int x_0, int n){
        double result = 0;
        List<Integer> keys = new ArrayList<>(data.keySet());

        if (x_0 == n) {
            return data.get(keys.get(n));
        }

        double firstDifference = DifferenceRecursive(data, x_0 + 1, n);
        double secondDifference = DifferenceRecursive(data, x_0, n-1);


        result = (firstDifference - secondDifference) / (keys.get(n) - keys.get(x_0));
        return result;
    }
}
