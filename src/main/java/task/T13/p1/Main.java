package task.T13.p1;

public class Main {
    public static void main(String[] args) throws Exception {
        Math math1 = new task.T13.p1.Math();
        math1.calculateSum(2,4,63,4);
        try {
            System.out.println(math1.getSpecialField());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Програма закінчена");
    }

}
