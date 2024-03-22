package Task.T1.review;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import task.T1.review.Task1;

import static org.junit.Assert.assertEquals;

public class Task1Test {
    private static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private PrintStream originalOut = System.out;

    @Before
    public void setUpStreamsBefore() {
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

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
    @MethodSource("numberIncreasingTestData")
    public void numberIncreasingTest(String number, String expectedOutput) {
        Task1.numberIncreasing(number);
        String actualOutput = outputStream.toString();
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    private static Stream<Arguments> numberIncreasingTestData() {
        return Stream.of(
                Arguments.of("1", "Твоє нове число: 2"),
                Arguments.of("-1", "Твоє нове число: -1"),
                Arguments.of("100", "Твоє нове число: 101")
        );
    }

    @ParameterizedTest
    @MethodSource("youngSisterTestData")
    public void youngSisterTest(String questionOfSister, String expectedOutput) {
        Task1.youngSister(questionOfSister);
        String actualOutput = outputStream.toString();
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    private static Stream<Arguments> youngSisterTestData() {
        return Stream.of(
                Arguments.of("Можна, будь-ласка, не йти в школу?", "Можна!"),
                Arguments.of("Можна не йти в школу сьогодні?", "А чарівне слово?"),
                Arguments.of("Мам, можна прогуляти школу?", "Не сьогодні!"),
                Arguments.of("Гав-гав", "Не зрозуміла, можеш повторити?"),
                Arguments.of("321456", "Не зрозуміла, можеш повторити?")
        );
    }

    @ParameterizedTest
    @MethodSource("squareTestData")
    public void squareTest(int a, String measure, String expectedOutput) {
        Task1.square(a, measure);
        String actualOutput = outputStream.toString();
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    private static Stream<Arguments> squareTestData() {
        return Stream.of(
                Arguments.of(3, "см", "Периметр - 12 см, Площа - 9 см"),
                Arguments.of(1, "дм", "Периметр - 4 дм, Площа - 1 дм"),
                Arguments.of(500, "мм", "Периметр - 2000 мм, Площа - 250000 мм")
        );
    }

    @ParameterizedTest
    @MethodSource("trafficLightData")
    public void trafficLight(String color, String expectedOutput) {
        Task1.trafficLight(color);
        String actualOutput = outputStream.toString();
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    private static Stream<Arguments> trafficLightData() {
        return Stream.of(
                Arguments.of("червоний", "Стій"),
                Arguments.of("жовтий", "Готуйся до руху"),
                Arguments.of("зелений", "Рухайся"),
                Arguments.of("сірий", "Невірний колір"),
                Arguments.of("фіолетовий", "Невірний колір")
        );
    }

    @ParameterizedTest
    @MethodSource("salaryTestData")
    public void calculateSalaryTest(double hoursWorked, double hourlyRate, boolean isWeekends, String expectedOutput) {
        Task1.calculateSalary(hoursWorked, hourlyRate, isWeekends);
        String actualOutput = outputStream.toString();
        Assertions.assertEquals(actualOutput, expectedOutput);
    }

    private static Stream<Arguments> salaryTestData() {
        return Stream.of(
                Arguments.of("40.0", "10.0", false, "400.00"),
                Arguments.of("35.5", "15.5", false, "550.25"),
                Arguments.of("20.25", "8.75", false, "177.19"),
                Arguments.of("20.25", "8.75", true, "0"),
                Arguments.of("40.0", "10.0", true, "0"),
                Arguments.of("35.5", "15.5", true, "0")

        );
    }
}
