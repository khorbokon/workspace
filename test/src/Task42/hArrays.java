package Task42;

import java.util.ArrayList;
import java.util.List;

public class hArrays {

    public static void main(String[] args) {
        //Task 1 - ArrayList;
        System.out.println("Task 2 - ArrayList: ");
        List<Integer> hArray2 = new ArrayList<Integer>();
        hArray2.add(1);
        hArray2.add(6);
        hArray2.add(3);
        hArray2.add(3);
        hArray2.add(4);
        hArray2.add(5);
        hArray2.add(5);
        hArray2.add(6);
        hArray2.add(0);

        System.out.println(hArray2);
        hArray2.sort(null);

        System.out.println(hArray2.get(0));
        int i=1;
        do{
            if (hArray2.get(i) != hArray2.get(i-1)){
                System.out.println(hArray2.get(i));
            }
            i++;
        } while (i<hArray2.size());

    }

}
