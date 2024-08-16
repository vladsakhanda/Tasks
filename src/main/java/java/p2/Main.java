package java.p2;

import task.T10.Hw.p1.User;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("rghjesru1218347", "fgsegt@gmail.com", "Roma228", "Human", "Fine");
        user1.info();
        user1.mail();
        System.out.println(Arrays.toString(user1.getChildren()));
        System.out.println(user1.getStatus());
        System.out.println(user1.getMood());
        System.out.println(user1.getEmail());
        System.out.println(user1.username);
    }
}
