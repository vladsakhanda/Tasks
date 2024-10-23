package task.T23;

import task.T22.Accountable;

import java.util.Arrays;

public class Account<T, U> implements Accountable<T, U> {
    /*
    Створи клас Account. Він повинен мати id, login, email, історію повідомлень.
     Додай гетери та сетери, обов'язково забезпечити, щоб id був незмінним.
     */

    private final T ID;
    private U login;
    private String email;
    private String[] massageHistory = {};

    public Account(T id, U login, String email, String[] massageHistory) {
        this.ID = id;
        this.login = login;
        this.email = email;
        this.massageHistory = massageHistory;
    }

    public T getID() {
        return ID;
    }

    public U getLogin() {
        return login;
    }

    public void setLogin(U login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getMassageHistory() {
        return massageHistory;
    }

    public void setMassageHistory(String[] massageHistory) {
        this.massageHistory = massageHistory;
    }

    public static void main(String[] args) {
//        long currentTime = System.currentTimeMillis();
//
//        System.out.println(currentTime);
//        for (int i = 5000000; i > 0; i--) {
//        }
//        System.out.println("\nКінець програми!");
//        System.out.println("Програма тривала: " + (System.currentTimeMillis() - currentTime));
//
//        Узагальнення(Generics, дженеріки)

//        Account account1 = new Account(123334, "ejuhgtui", "jvdthg@gthjy", null);
//        Account account2 = new Account("123334", "ejuhgtui", "jvdthg@gthjy", null);
//
//        int[] ids = new int[5];
//        ids[0] = (int) account1.getID();
//        ids[1] = account2.getID().toString();
//
//        System.out.println(Arrays.toString(ids));
//
//        System.out.println();

        Account<String, String> account3 = new Account<>("123334", "ejuhgtui", "jvdthg@gthjy", null);
        Account<Integer, String> account4 = new Account<>(123334, "ejuhgtui", "jvdthg@gthjy", null);

        int[] ids = new int[5];
        ids[0] = account4.getID();
        ids[1] = Integer.parseInt(account3.getID());

        System.out.println(Arrays.toString(ids));

        System.out.println();

        account4.setLogin(null);
    }

    @Override
    public T getId() {
        return null;
    }

    @Override
    public U getError() {
        return null;
    }
}




