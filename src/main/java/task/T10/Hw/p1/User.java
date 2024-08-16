package task.T10.Hw.p1;

import java.util.Scanner;

public class User {
    private String password;
    private String email;
    public String username;
    protected String status;
    String mood;


    {
        password = "ADever1234";
        email = "dog@gmail.com";
        username = "Baloon__";
        status = "Dog";
        mood = "fine";

    }

    public User(String password, String email, String username, String status, String mood) {
        this.password = password;
        this.email = email;
        this.username = username;
        this.status = status;
        this.mood = mood;

    }

    User() {
    }

    private String[] children = {"Sharik"};

    public String[] getChildren() {
        return this.children.clone();
    }


    public String getEmail() {
        return this.email;
    }

    public String getStatus() {
        return this.status;
    }

    public String getMood() {
        return this.mood;
    }


    public void info() {
        System.out.println(username + " " + status + " " + mood);
    }

    public void mail() {
        Scanner in = new Scanner(System.in);
        String p = in.nextLine();
        if (p.equals(password)) {
            System.out.println(email);
        }
    }


}
