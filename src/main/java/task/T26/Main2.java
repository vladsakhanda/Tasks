package task.T26;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
deleteCharInString("Index", 1);
    }

    private static void deleteCharInString(String str, int index) {
       char[] arr = {};
        for (int i = 0; i < str.length(); i++) {
            if (i == index) {
                continue;
            }
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = str.charAt(i);
        }
        System.out.println(arr);
    }


}
