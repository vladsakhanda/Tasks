package Task.T2;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

import task.T2.LoopsWithoutTests;

public class LoopsWithoutTestsTest {
    @Test
    public void testFunc1WithSumOfDigits16() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        LoopsWithoutTests.func1(16);

        // Assert
        String expectedOutput = "1789 (1 + 7 + 8 + 9)\n2594 (2 + 5 + 9 + 4)\n3469 (3 + 4 + 6 + 9)\n4753 (4 + 7 + 5 + 3)\n5832 (5 + 8 + 3 + 2)\n".
                replace("\n", System.lineSeparator());
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testFunc1WithSumOfDigits15() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        LoopsWithoutTests.func1(15);

        // Assert
        String expectedOutput = "1579 (1 + 5 + 7 + 9)\n2479 (2 + 4 + 7 + 9)\n3569 (3 + 5 + 6 + 9)\n".
                replace("\n", System.lineSeparator());
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testCountdownWithPositiveInput() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        LoopsWithoutTests.func3(5); // Викликаємо countdown() для числа 5

        // Assert
        String expectedOutput = "5 5 5 5 5 \n4 4 4 4 \n3 3 3 \n2 2 \n1 \nКінець!".
                replace("\n", System.lineSeparator());
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testCountdownWithOneInput() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        LoopsWithoutTests.func3(1); // Викликаємо countdown() для числа 1

        // Assert
        String expectedOutput = "1 \nКінець!".
                replace("\n", System.lineSeparator());
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testCountdownWithZeroInput() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        LoopsWithoutTests.func3(0); // Викликаємо countdown() для числа 0

        // Assert
        String expectedOutput = "Кінець!".
                replace("\n", System.lineSeparator());
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testFunc4WithNonZeroInput() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        LoopsWithoutTests.func4(3); // Викликаємо func4() для числа 3

        // Assert
        String output = outContent.toString().trim();
        String expectedOutput = "1\n3".
                replace("\n", System.lineSeparator());
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testFunc4WithZeroInput() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        LoopsWithoutTests.func4(0); // Викликаємо func4() для числа 0

        // Assert
        String output = outContent.toString().trim();
        String expectedOutput = "Ділення на нуль неможливе.";
        assertEquals(expectedOutput, output);
    }

    @Test
    public void testFunc4SixInput() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        LoopsWithoutTests.func4(6); // Викликаємо func4() для від'ємного числа (-4)

        // Assert
        String output = outContent.toString().trim();
        String expectedOutput = "1\n2\n3\n6".
                replace("\n", System.lineSeparator());
        assertEquals(expectedOutput, output);
    }
}
