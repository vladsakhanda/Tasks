package task.T24.Hw.Task2;

public class Main implements PoliceDog<String, String> {

    @Override
    public String bite() {
        return "Ням Ням";
    }

    @Override
    public void barking() {
        System.out.println("Wah Wah");
    }

    @Override
    public String sniff() {
       int random = (int) Math.random();
       if (random%2 == 0) {
           return "У вас немає наркотиків";
       } else {
           return "У вас є наркотики";
       }
    }



    @Override
    public String info() {
        return "";
    }
}
