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
            String p_i = Double.toString(i);
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

        int firstKey = keys.get(0);

        //maybe first Difference outside of loop somehow
        // for (int i = 1; i < keys.size(); i++) {
        //     int currentKey = keys.get(i);

        //     if(i-1 == 0){
        //         result[i-1] = Difference(currentKey, firstKey, data.get(currentKey), data.get(firstKey));
        //     }
        //     else{
        //         double currentDifference = Difference(currentKey, firstKey, data.get(currentKey), data.get(firstKey));
        //         double lastDifference = result [i-2];

        //         result[i-1] = Difference(currentKey, firstKey, currentDifference, lastDifference);
        //     }


        // }
        for (int i = 0; i < keys.size()-1; i++) {
            result[i] = DifferenceRecursive(data, 0, i+1);
        }

        return result;
    }

    public static double Difference(int currentKey, int firstKey, double currentVal, double firstVal){
        double result = 0;

        result = (currentVal - firstVal) / (currentKey - firstKey);
        
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
