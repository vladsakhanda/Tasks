package task.T23;

public class Account {
    /*
    Створи клас Account. Він повинен мати id, login, email, історію повідомлень.
     Додай гетери та сетери, обов'язково забезпечити, щоб id був незмінним.
     */

    private final Object ID;
    private String login;
    private String email;
    private String[] massageHistory = {};

    public Account(Object id, String login, String email, String[] massageHistory) {
        this.ID = id;
        this.login = login;
        this.email = email;
        this.massageHistory = massageHistory;
    }

    public Object getID() {
        return ID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
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
        Account account = new Account(123334, "ejuhgtui", "jvdthg@gthjy", null);
        Account account2 = new Account("123334", "ejuhgtui", "jvdthg@gthjy", null);
    }
}
