package Task31;

public class Calc
{

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

    public static void main(String[] args) {
        // Task 1: calculator

        int result = sum(10, 15);
        System.out.println(result);

        result = vid(100, 15);
        System.out.println(result);

        result = mno(10, 15);
        System.out.println(result);

        float result1 = dil(9, 7);
        System.out.println(result1);

        System.out.print("\r");
    }
}
