// Всі члени класу завжди мають модифікатор доступу (клас, поле, метод, конструктор, функція)
/* Існує 4 модифікатори доступу
    1. public
    2. private
    3. protected
    4. default (за замовчуванням)

Модифікатори доступу допомагають керувати доступом в програмі.
 */
public class Person {
    String name = "Anton"; // Модифікатор доступу default
    public int age = 33; // Модифікатор доступу public
    protected String sex = "boy"; // Модифікатор доступу protected
    private String job = "doctor"; //  Модифікатор доступу private

    private Person() {

    }

    protected void sleep() {
        System.out.println("I am sleeping!");
    }
}
