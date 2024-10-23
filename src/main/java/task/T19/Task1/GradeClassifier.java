package task.T19.Task1;

import java.util.Scanner;

public class GradeClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть оцінку (0-100): ");
        int score = scanner.nextInt();

        Grade grade = classifyGrade(score);

        if (grade != null) {
            System.out.println(grade + ": " + grade.getDescription());
        } else {
            System.out.println("Невірна оцінка.");
        }
    }

    public static Grade classifyGrade(int score) {
        switch (score / 10) {
            case 10:
            case 9:
                return Grade.A;
            case 8:
                return Grade.B;
            case 7:
                return Grade.C;
            case 6:
                return Grade.D;
            default:
                if (score < 60 && score > 0) {
                    return Grade.F;
                } else {
                    return null;
                }
        }



    }
}
