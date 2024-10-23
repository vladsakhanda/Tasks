package task.T20.HW;

public class Wrappers {
    public static void main(String[] args) {
        String a = "true";
        Boolean b = Boolean.valueOf(a);

        String a1 = "23";
        Integer b1 = Integer.valueOf(a1);
        System.out.println(b1.intValue());

    }
}
