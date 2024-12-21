package task.T26;

public class Main {
    public static void main(String[] args) {
       boolean isPal = isPalindrome("121");
       if (isPal) {
           System.out.println("Це паліндром");
       } else {
           System.out.println("Це не паліндром");
       }

    }
    private static boolean isPalindrome(String pln) {
        for (int i = 0; i < pln.length(); i++) {
            if (pln.charAt(i) != pln.charAt(pln.length() - i - 1)) {
               return false;
            }
        }
        return true;
    }
}
