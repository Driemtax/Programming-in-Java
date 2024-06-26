package Math.NewtonPolynom;

import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.*;

public class NewtonPolynom {
    public static String CreatePolynom(LinkedHashMap<Integer, Double> data){
        String result = "";

        Object firstKey = data.keySet().toArray()[0];
        String p0 = data.get(firstKey).toString();
        result += p0;

        double[] differences = DivisionDifferences(data);
        int count = 1;
        for (double i : differences) {
            String p_i;
            if (i % 1 == 0 || i == 0.0) {
                p_i = Double.toString(i);
                result += (i < 0) ? "" : "+";       
            }
            else {
                int fraction[] = RationalPresentation.Fraction(i);
                result += (fraction[0] < 0 || fraction[1] < 0) ? "" : "+";
                p_i = Integer.toString(fraction[0]);
                p_i += "/" + Integer.toString(fraction[1]);
            }
            result += p_i;
            for (int j = 0; j < count; j++) {
                String x_i = data.keySet().toArray()[j].toString();
                //Hier muss noch der case x -- y abgefangen werden
                String x;
                if (x_i.contains("-")) {
                    x_i = x_i.replace("-", "");
                    x = "*(x+" + x_i + ")";
                }
                else {
                    x = "*(x-" + x_i + ")";
                }
                result += x;
            }
            count++;
        }


        return result;
    }

    public static double[] DivisionDifferences(LinkedHashMap<Integer, Double> data){
        double[] result = new double[data.size() - 1];
        List<Integer> keys = new ArrayList<>(data.keySet());

        for (int i = 0; i < keys.size()-1; i++) {
            result[i] = DifferenceRecursive(data, 0, i+1);
        }

        return result;
    }

    public static double DifferenceRecursive(LinkedHashMap<Integer, Double> data,int x_0, int n){
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
