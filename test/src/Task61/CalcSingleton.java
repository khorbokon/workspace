package Task61;

public class CalcSingleton {
    private static CalcSingleton ourInstance = new CalcSingleton();

    public static CalcSingleton getInstance() {
        return ourInstance;
    }

    private CalcSingleton() {
    }

    //methods
    public static int sum (int valA, int valB){
        return valA + valB;
    }

    public static int vid (int valA, int valB){
        return valA - valB;
    }

    public static int mno (int valA, int valB){
        return valA * valB;
    }

    public static float dil (float valA1, float valB1) {
        return valA1 / valB1;
    }


    public static void main (String [] args){
        System.out.println("sum Result: " + (CalcSingleton.getInstance().sum(1,2)));


    }


}
