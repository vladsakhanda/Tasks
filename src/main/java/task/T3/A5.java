package task.T3;

import java.util.ArrayList;

public class A5 {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>();
        strs.add("яблуко");
        strs.add("банан");
        strs.add("вишня");
        strs.add("сік");
        strs.add("Супер сила");
        System.out.println(concatenation(strs));

    }
    static private String concatenation(ArrayList<String> strs) {
        String a = strs.get(0);
        for (int i = 0; i < strs.size(); i++) {
            if (a.toString().length() > strs.get(i).toString().length()) {
                a = strs.get(i);
            }
        }
        String b = strs.get(0);
        for (int i = 0; i < strs.size(); i++) {
            if (b.toString().length() < strs.get(i).toString().length()) {
                b = strs.get(i);
            }
        }
        return a+"-"+b;
    }

}
