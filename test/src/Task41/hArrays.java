package Task41;

import java.util.ArrayList;
import java.util.List;

public class hArrays {

    public static void main(String[] args) {
        // Task 1 - Array

        String[] hArray = {"12", "23", "34", "12", "56", "67"};

        for (int i=0; i<hArray.length; i++){
            if (hArray[i]== "12"){
                hArray[i] = "replaced";
            }
        }

        for (int i=0; i<hArray.length; i++){
            System.out.println(hArray[i]);
        }
        System.out.println("\n");

        // Task 1 - ArrayList
        List<String> hArray1 = new ArrayList<String>();
        hArray1.add("12");
        hArray1.add("23");
        hArray1.add("34");
        hArray1.add("12");
        hArray1.add("56");
        hArray1.add("67");

        System.out.println("ArrayList: " + hArray1);

        for (int i=0; i<hArray1.size(); i++){
            if (hArray1.get(i)== "12"){
                hArray1.set(i,"replaced");
            }
        }
        System.out.println(hArray1);
        System.out.println("\n");

    }

}
