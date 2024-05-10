import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

public class NewtonPolynom {
    public static String CreatePolynom(HashMap<Integer, Integer> data){
        String result = "";

        Object firstKey = data.keySet().toArray()[0];
        String p0 = data.get(firstKey).toString();
        result += p0;

        int[] differences = DivisionDifferences(data);
        int count = 1;
        for (int i : differences) {
            result += "+";
            String p_i = Integer.toString(i);
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

    public static int[] DivisionDifferences(HashMap<Integer, Integer> data){
        int[] result = new int[data.size() - 1];
        List<Integer> sortedKeys = new ArrayList<>(data.keySet());
        Collections.sort(sortedKeys);

        for (int i = 0; i < sortedKeys.size()-1; i++) {
            int currentKey = sortedKeys.get(i);
            int nextKey = sortedKeys.get(i+1);

            result[i] = (data.get(nextKey) - data.get(currentKey)) / (nextKey-currentKey);
        }

        return result;
    }
}
