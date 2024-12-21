package task.String;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Рядок є незмінним. Тому при будь-якій зміні рядка - буде створений новий рядок під капотом, щоб забезпечити незмінність!
        // Це причина, чому рядок буває ресурсозатратним
//        String str = " Hello";
//
//        System.out.println(str.length());

//        char[] chars = new char[]{'H', 'b'};
//        System.out.println(chars);

//        String newChars = String.valueOf(chars);
//        System.out.println(newChars);

//        String str = " Hello";
//        char[] chars1 = str.toCharArray();
//
//        System.out.println(chars1);
//        int[] ints = new int[] {1, 2};
//        System.out.println(ints); // [I@7b23ec81

//        String str1 = "F";
//        String str2 = "A";
//        // від'ємне, якщо перший рядок менший за другий
//        // додатнє, , якщо перший рядок більший за другий
//        // 0 - якщо рядки рівні
//        System.out.println((int) 'A');
//        System.out.println((int) 'F');
//        System.out.println(str1.compareTo(str2));

        // indexOf можна комбінувати з delete (дивись нижче)
//        String str = "HeWa Wo World";
//        System.out.println(str.indexOf('1')); // -1
//        System.out.println(str.indexOf("HeWa Wo World")); // 0
//        System.out.println(str.indexOf("l")); // 11
//        System.out.println(str.indexOf("HeWa Wo World1")); // -1

//        // Дозволяє перевірити чи починається/закінчується рядок з певного набору символів
//        String str = "myFile.exe";
//        boolean start = str.startsWith("my");
//        boolean end = str.endsWith("exe");
//        System.out.println(start);
//        System.out.println(end);
//        boolean end2 = str.endsWith("File");
//        System.out.println(end2);

//        String string = "Hello world!";
//        String newString1 = string.replace('l', (char) 530);
//        String newString2 = string.replace(' ', '8');
//        String newString3 = string.replace(" ", "  ");
//        String newString4 = string.replace(" ", "");
//        String newString5 = string.replace("Hello", "Я знаю Джаву!");
//        System.out.println(newString1);
//        System.out.println(newString2);
//        System.out.println(newString3);
//        System.out.println(newString4);
//        System.out.println(newString5);

//        // Видаляє початкові і кінцеві пробіли
//        String str = " Привіт, Макс! ";
//        System.out.println(str);
//        System.out.println(str.trim());

//        // sub - під/саб
//        // Повертає підрядок від першого вказаного індекса і до останнього вказаного (до кінця, якщо не вказано)
//        String str = "Hello world";
//        String substr1 = str.substring(6);
//        String substr2 = str.substring(3, 5);
//        System.out.println(substr1);
//        System.out.println(substr2);

//        String str = "HelloWorld";
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());

//        String text = "I love eating tasty people";
//        System.out.println(text);
//        System.out.println(Arrays.toString(text.split(" ")));
//        String[] words = text.split(" ");
//        System.out.println(Arrays.toString(words));
//        System.out.println(Arrays.toString(text.split("eating")));

        // StringBuilder та StringBuffer - класи, які вирішують проблему із затратністю String
        // Ці класи абсолютно ідентичні, але StringBuffer створений для роботи з багатопоточністю (є безпечним з потоками)
        // Чим безпечніший клас при роботі з багатопоточністю (стріми, ядра), тим він більш ресурсно затратний
        // StringBuilder є потоконебезпечним! Але швидкий, оскільки не треба синхронізовувати для роботи з потоками

//        StringBuilder stringBuilder = new StringBuilder("1");
//        System.out.println(stringBuilder);
//        int capacity = stringBuilder.capacity();
//        System.out.println(capacity);
//        stringBuilder.ensureCapacity(38);
//        capacity = stringBuilder.capacity();
//        System.out.println(capacity);

//        StringBuilder stringBuilder = new StringBuilder("Ванька встанька");
//        System.out.println(stringBuilder.charAt(5));
//        stringBuilder.setCharAt(5, 'Х');
//        System.out.println(stringBuilder.charAt(5));
//        System.out.println(stringBuilder);
//
//        stringBuilder.toString();

//        StringBuilder stringBuilder = new StringBuilder("Ванька встанька");
//        char[] chars = new char[15];
//        stringBuilder.getChars(1, 7, chars, 2); // dst - скорочення від destination (пункт призначення з англ.)
//        System.out.println(chars);

//        StringBuilder stringBuilder = new StringBuilder("Ванька");
//        stringBuilder.append(" ").append("встанька").append(" ").append("лінька");
//        System.out.println(stringBuilder);

//        StringBuilder stringBuilder = new StringBuilder("Ванька");
//        stringBuilder.insert(4, '1');
//        stringBuilder.insert(5, "ШШШШ");
//        System.out.println(stringBuilder);

//        StringBuilder stringBuilder = new StringBuilder("Ванька");
////        stringBuilder.delete(0, 4);
//        System.out.println(stringBuilder);
//        stringBuilder.deleteCharAt(3);
//        System.out.println(stringBuilder);

//        StringBuilder stringBuilder = new StringBuilder("Ванька встанька");
//        System.out.println(stringBuilder.substring(6));
//        System.out.println(stringBuilder.substring(2, 8));

//        StringBuilder stringBuilder = new StringBuilder("Добре");
//        stringBuilder.setLength(10);
//        System.out.println(stringBuilder);

//        StringBuilder stringBuilder = new StringBuilder("Добре");
//        stringBuilder.replace(0, 3, "Ворапв");
//        System.out.println(stringBuilder);

//        StringBuilder stringBuilder = new StringBuilder("Добре");
//        stringBuilder.reverse();
//        System.out.println(stringBuilder);


    }
}

