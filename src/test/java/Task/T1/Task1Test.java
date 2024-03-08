package Task.T1;


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task.T1.Task1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

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

    @Test
    public void firstTaskTest() {
        Task1.firstTask();

        String expectedOutput = "Це моє перше завдання!";

        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);
    }

    @ParameterizedTest
    @MethodSource("secondTaskTestData")
    public void secondTaskTest(int a, int b, String expectedOutput) {
        Task1.secondTask(a, b);

        String actualOutput = outputStream.toString().trim();
        assertEquals(expectedOutput, actualOutput);
    }

    private static Stream<Arguments> secondTaskTestData() {
        return Stream.of(
                Arguments.of(2, 5, "Сума: 2 + 5 = 7"),
                Arguments.of(-10, 18, "Сума: -10 + 18 = 8"),
                Arguments.of(1024, 0, "Сума: 1024 + 0 = 1024"),
                Arguments.of(-1, 1, "Сума: -1 + 1 = 0")
        );
    }

    @ParameterizedTest
    @MethodSource("thirdTaskTestData")
    public void thirdTaskTest(float a, float b, String expectedOutput) {
        Task1.thirdTask(a, b);

        String actualOutput = outputStream.toString().trim();
        assertEquals(expectedOutput, actualOutput);
    }

    private static Stream<Arguments> thirdTaskTestData() {
        return Stream.of(
                Arguments.of(10, 3, "10 поділити на 3 дорівнює 3,33"),
                Arguments.of(5, 2, "5 поділити на 2 дорівнює 2,50"),
                Arguments.of(-44, 32, "-44 поділити на 32 дорівнює -1,38")
        );
    }

    @ParameterizedTest
    @MethodSource("fourthTaskTestData")
    public void fourthTaskTest(float day, String expectedOutput) {
        Task1.fourthTask(day);

        String actualOutput = outputStream.toString().trim();
        assertEquals(expectedOutput, actualOutput);
    }

    private static Stream<Arguments> fourthTaskTestData() {
        return Stream.of(
                Arguments.of(364, "До кінця року залишилося 1 днів"),
                Arguments.of(365, "До кінця року залишилося 0 днів"),
                Arguments.of(0, "До кінця року залишилося 365 днів"),
                Arguments.of(1, "До кінця року залишилося 364 днів"),
                Arguments.of(2.5f, "До кінця року залишилося 363 днів")
        );
    }

    @ParameterizedTest
    @MethodSource("powerTestData")
    public void powerTest(float number, String expectedOutput) {
        Task1.power(number);
        String actualOutput = outputStream.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    private static Stream<Arguments> powerTestData() {
        return Stream.of(
                Arguments.of(1, "Степінь числа 1,000 = 1,000"),
                Arguments.of(2, "Степінь числа 2,000 = 4,000"),
                Arguments.of(-1, "Степінь числа -1,000 = 1,000"),
                Arguments.of(-2, "Степінь числа -2,000 = 4,000"),
                Arguments.of(0, "Степінь числа 0,000 = 0,000"),
                Arguments.of(1.33f, "Степінь числа 1,330 = 1,769"),
                Arguments.of(-1.33f, "Степінь числа -1,330 = 1,769")
        );
    }
}
