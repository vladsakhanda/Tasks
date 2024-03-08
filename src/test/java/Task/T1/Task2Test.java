package Task.T1;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task.T1.Task2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Task2Test {
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @ParameterizedTest
    @MethodSource("firstTaskTestData")
    public void firstTaskTest(int age, String expectedOutput) {
        Task2.task1(age);

        String actualOutput = outputStream.toString();

        String arguments = "Аргументи: age: " + age;

        assertEquals(expectedOutput, actualOutput, arguments);
    }

    private static Stream<Arguments> firstTaskTestData() {
        return Stream.of(
                Arguments.of(-1, "Ти що на приколі? Народися спочатку!"),
                Arguments.of(0, "Підрости трішечки!!"),
                Arguments.of(17, "Підрости трішечки!!"),
                Arguments.of(18, "Ти мабуть чийсь батько чи мати..."),
                Arguments.of(45, "Ти мабуть чийсь батько чи мати..."),
                Arguments.of(46, "Оо-оой, старюга!"),
                Arguments.of(125, "Ти що, привид?!"),
                Arguments.of(125, "Ти що, привид?!")
        );
    }

    @ParameterizedTest
    @MethodSource("secondTaskTestData")
    public void secondTaskTest(int age, float money, float price, String expectedOutput) {
        Task2.task2(age, money, price);

        String actualOutput = outputStream.toString();

        String arguments = "Аргументи: age: " + age +
                ", money: " +
                money +
                ", price: " +
                price;

        Assertions.assertEquals(expectedOutput, actualOutput, arguments);

        assertEquals(expectedOutput, actualOutput, arguments);
    }

    private static Stream<Arguments> secondTaskTestData() {
        return Stream.of(
                Arguments.of(18, 50, 50, "Пригощайся!"),
                Arguments.of(18, 50, 49.9999999999f, "Пригощайся!"),
                Arguments.of(18, 50, 50.0000000001f, "Вибач, але в тебе недостатньо грошей!"),
                Arguments.of(17, 50, 50, "Вибач, але пиво тільки для дорослих!"),
                Arguments.of(17, 50, 49.9999999999f, "Вибач, але пиво тільки для дорослих!"),
                Arguments.of(17, 50, 50.0000000001f, "Вибач, але пиво тільки для дорослих!"),
                Arguments.of(17, -500, 500, "Вибач, але пиво тільки для дорослих!"),
                Arguments.of(18, -500, 500, "Вибач, але в тебе недостатньо грошей!")
        );
    }

    @ParameterizedTest
    @MethodSource("thirdTaskTestData")
    public void thirdTaskTest(int number1, int number2, String answerOfBrother, String expectedOutput) {
        Task2.task3(number1, number2, answerOfBrother);

        String actualOutput = outputStream.toString();

        String arguments = "Аргументи: number1: " + number1 +
                ", number2: " +
                number2 +
                ", answerOfBrother: " +
                answerOfBrother;

        Assertions.assertEquals(expectedOutput, actualOutput, arguments);
    }

    private static Stream<Arguments> thirdTaskTestData() {
        return Stream.of(
                Arguments.of(10, 10, "Числа рівні", "Молодець, братику!"),
                Arguments.of(0, 0, "Числа рівні", "Молодець, братику!"),
                Arguments.of(-10, -10, "Числа рівні", "Молодець, братику!"),
                Arguments.of(10, -10, "Перше число більше", "Молодець, братику!"),
                Arguments.of(-10, 10, "Друге число більше", "Молодець, братику!"),
                Arguments.of(0, 1, "Друге число більше", "Молодець, братику!"),
                Arguments.of(1, 0, "Перше число більше", "Молодець, братику!"),

                Arguments.of(110, 110, "Перше число більше", "Ти помилився, правильна відповідь - Числа рівні"),
                Arguments.of(1, -1, "Друге число більше", "Ти помилився, правильна відповідь - Перше число більше"),
                Arguments.of(32432522, 32432521, "Друге число більше", "Ти помилився, правильна відповідь - Перше число більше")
        );
    }
}

