package Math.NewtonPolynom;

import java.util.LinkedHashMap;

public class Programm {
    public static void main(String args[]){
        LinkedHashMap<Integer, Double> data = new LinkedHashMap<Integer, Double>();
        data.put(0,0.0);
        data.put(1,0.0);
        data.put(2,1.0);
        data.put(3,0.0);
        data.put(4, 0.0);


        String polynom = NewtonPolynom.CreatePolynom(data);

        System.out.printf("f(x)= %s\n", polynom);
    }
}