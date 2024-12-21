package task.T26;

public class Main {
    public static void main(String[] args) {
       boolean isPal = isPaliondrome("aba");
       if (isPal == true) {
           System.out.println("Це палиондром");
       } else {
           System.out.println("Це не палиондром");
       }

    }


    private static boolean isPaliondrome(String pln) {
        for (int i = 0; i < pln.length(); i++) {
            if (pln.charAt(i) != pln.charAt(pln.length() - i - 1)) {
               return false;
            }
        }
        return true;
    }
}
