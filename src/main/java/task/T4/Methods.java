package task.T4;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        sum(1, 2, 3);
        a("as", "fds");

    }

    static void sum(int ...nums){
        System.out.println(Arrays.toString(nums));

        int result =0;
        for(int n: nums)
            result += n;
        System.out.println(result);
    }

    static void  a(String ... words) {
        System.out.println(words);
    }
}
