package task.T26;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(newCharAt("abcd", -19));
    }

    private static char newCharAt(String str,int index) {
        if (index >= 0) {
           return str.charAt(index);
        } else if (index < 0) {
            if (-index <= str.length()) {
                int result;
                result = str.length() +index;
                return str.charAt(result);
            } else {
                float i = (float) index/str.length();
                i = (float) -(Math.ceil(i));
                int result = (int) (index + i*str.length());
                result = str.length() + result;
                return str.charAt(result);
            }

        }
        return 0;
    }




}
