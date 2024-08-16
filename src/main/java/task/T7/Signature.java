package task.T6.C2;

public class Signature {
    public static void main(String[] args) {
        System.out.println(square(3));
    }

    /*
        Сигнатура функції (метода) - це загальна інформація про функцію (метод)

        Приклад сигнатури для функції square:
            static float square(float number)

        Сигнатура функції - така інформація як static/public/private/назва функції, параметри, повертаємий тип даних

        Функція (метод) - складається з сигнатури та блоку коду
     */
    static float square(float number) {
        return number * number;
    }
}
