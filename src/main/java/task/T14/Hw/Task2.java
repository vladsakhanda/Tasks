package task.T14.Hw;

import java.util.Arrays;

public class Task2 {
   static int [] intArray = {};
   static float [] floatArray = {};
   static String [] StringArray = {};
   static boolean [] booleanArray = {};
   static char [] charArray = {};

    public static void main(String[] args) {
        addElToArray(7);
        System.out.println(Arrays.toString(intArray));
    }


   static void addElToArray (int a) {
           intArray = Arrays.copyOf(intArray, intArray.length + 1);
           intArray[intArray.length-1] = a;
    }
}
