package task.T23;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println(Color.GREEN.getColor());

    }
}
enum Color {
    RED("red"),
    GREEN("green"),
    YELLOW("yellow");

    Color() {

    }

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}









