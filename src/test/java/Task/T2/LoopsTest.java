package Task.T2;

import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import task.T2.Loops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


public class LoopsTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testTask1() {
        // Arrange
        String expectedOutput = generateTask1ExpectedOutput();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        Loops.task1();

        // Assert
        assertEquals(expectedOutput, outputStream.toString());
    }

    private String generateTask1ExpectedOutput() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Test
    public void testTask2() {
        // Arrange
        String expectedOutput = generateTask2ExpectedOutput();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        Loops.task2();

        // Assert
        assertEquals(expectedOutput, outputStream.toString());
    }

    private String generateTask2ExpectedOutput() {
        StringBuilder sb = new StringBuilder();
        for (int i = 100; i >= 0; i--) {
            sb.append(i).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Test
    public void testTask3() throws InterruptedException {
        // Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Act
        executorService.submit(() -> {
            Loops.task3();
        });

        // Sleep for 3 seconds
        Thread.sleep(100); // 3000 milliseconds = 3 seconds

        // Shutdown the executor
        executorService.shutdownNow();

        String actual = outputStream.toString().substring(0, 1001);
        String expectedOutput = generateTask3ExpectedOutput().substring(0, 1001);

        assertEquals(expectedOutput, actual);
    }

    private String generateTask3ExpectedOutput() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i).append(System.lineSeparator());
        }
        for (int i = 99; i >= 1; i--) {
            sb.append(i).append(System.lineSeparator());
        }

        for (int i = 2; i <= 100; i++) {
            sb.append(i).append(System.lineSeparator());
        }
        for (int i = 99; i >= 1; i--) {
            sb.append(i).append(System.lineSeparator());
        }

        return sb.toString();
    }

    @ParameterizedTest
    @MethodSource("task4TestData")
    public void testTask4(int n, String expectedOutput) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Loops.task4(n);

        String actualOutput = outContent.toString().trim();

        assertEquals(expectedOutput, actualOutput);
    }

    private static Stream<Arguments> task4TestData() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "3"),
                Arguments.of(3, "6"),
                Arguments.of(4, "10"),
                Arguments.of(5, "15"),
                Arguments.of(6, "21"),
                Arguments.of(7, "28"),
                Arguments.of(0, "0"),
                Arguments.of(-1, "Суми не існує")
        );
    }

    @Test
    public void task5Test() {
        Assertions.assertEquals(1, Loops.task5(0));
        assertEquals(1, Loops.task5(1));
        assertEquals(2, Loops.task5(2));
        assertEquals(6, Loops.task5(3));
        assertEquals(24, Loops.task5(4));
        assertEquals(120, Loops.task5(5));
    }
}
