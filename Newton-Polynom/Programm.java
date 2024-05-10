import java.util.HashMap;

public class Programm {
    public static void main(String args[]){
        HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
        data.put(1,2);
        data.put(3,6);
        data.put(4,5);


        String polynom = NewtonPolynom.CreatePolynom(data);

        System.out.printf("f(x)= %s", polynom);
    }
}