package task.String;

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

        String word = "";
        System.out.println(word.length() == 0);
    }
}

