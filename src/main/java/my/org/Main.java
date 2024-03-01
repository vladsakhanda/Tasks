package my.org;

public class Main {
    public static void main(String[] args) {
char a = 'a' + 25;
        System.out.println(a);
    }

    public float power(float number) {
        /*
            Метод знаходить степінь числа number
         */

        return 0;
    }

    public String access(String password) {
        /*
            Ви отримаєте від користувача пароль password.

            Якщо пароль = "12345", поверніть повідомлення "Серйозно? І це твій пароль?!"
            Якщо пароль = "correct password", поверніть повідомлення "Доступ надано!"
            При будь-якому іншому паролі, поверніть повідомлення "Доступ відмовлено!"
         */
        return null;
    }

    public String evenOrOdd(int number) {
        /*
        Програма перевіряє число number.

        Якщо воно парне - повертає "Парне"
        Якщо воно непарне - повертає "Непарне"
        Але якщо number від'ємне або 0 - повертає null"
         */
        return null;
    }

    public char encryptWord(char symbol, int offset) {
        /*
        Ти отримуєш символ symbol. Твоє завдання його зашифрувати!
        Для цього тобі потрібно зсунути цей символ на offset і повернути зашифрований символ

        Але якщо offset більше ніж 26 треба завжди повертати символ 'Q'
         */

        return '1';
    }
}