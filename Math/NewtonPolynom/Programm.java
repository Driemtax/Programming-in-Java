package Math.NewtonPolynom;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Programm {
    public static void main(String args[]){
        LinkedHashMap<Integer, Double> data = new LinkedHashMap<Integer, Double>();
        data.put(1,82.0);
        data.put(2,81.9);
        data.put(3,82.1);
        data.put(4, 81.8);
        data.put(11, 81.7);
        data.put(42, 81.1);
        data.put(56, 79.7);
        data.put(58, 79.4);
        data.put(59, 78.9);
        data.put(62, 79.9);
        data.put(63, 79.4);
        data.put(64, 79.1);
        data.put(65, 78.7);


        String polynom = NewtonPolynom.CreatePolynom(data);

        System.out.printf("f(x)= %s\n", polynom);
    }
}