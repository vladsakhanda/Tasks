package task.T26;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String testString = "abcd";
        System.out.println(newCharAt(testString, -8));
        System.out.println(newCharAt(testString, -19));
        for (int i = 3; i > -100; i--) {
            System.out.println(newCharAt(testString, i));
        }

    }

    private static char newCharAt(String str, int index) {
        if (index >= 0) {
            return str.charAt(index);
        } else {
            // index = -8
            int strLength = str.length(); // 4

            if (-index <= strLength) {
                int result;
                result = strLength + index; // 3
                return str.charAt(result);
            } else {
                float i = (float) index / strLength; // -8 / 4 = -2
                i = (float) -(Math.ceil(i)); // 2
                int result = (int) (index + i * str.length());
                if (index % str.length() == 0) {
                    return str.charAt(result);
                } else {
                    result = str.length() + result;
                    return str.charAt(result);
                }
            }
        }
    }

//    private static char newCharAtVlad(String str, int index) {
//        if (index >= 0) {
//            return str.charAt(index);
//        } else {
//            // abcd
//            // index = -8
//            int strLength = str.length();
//            int result;
//
//            int resultIndex = ;
//
//
//            result = strLength + index;
//            return str.charAt(result);
//
//        }
}



