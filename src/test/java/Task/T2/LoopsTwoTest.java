package Task.T2;

import org.junit.Test;
import task.T2.LoopsTwo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class LoopsTwoTest {
    @Test
    public void testPositiveNumberFinder() {
        String input = "0\n-1\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        System.setIn(in);

        LoopsTwo.positiveNumberFinder();

        System.setOut(originalOut);

        String expectedOutput = "Введіть додатнє число:" + System.lineSeparator() +
                "Мені треба додатнє число!" + System.lineSeparator() +
                "Введіть додатнє число:" + System.lineSeparator() +
                "Мені треба додатнє число!"  + System.lineSeparator() +
                "Введіть додатнє число:"  + System.lineSeparator() +
                "Дякую!"  + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testDrawTriangle() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        LoopsTwo.drawTriangle(3, 1);
        String expectedOutput1 = "*\n**\n***\n".replace("\n",  System.lineSeparator());
        assertEquals(expectedOutput1, outContent.toString());

        outContent.reset();

        LoopsTwo.drawTriangle(2, 2);
        String expectedOutput2 = "*\n**\n*\n**\n".replace("\n",  System.lineSeparator());
        assertEquals(expectedOutput2, outContent.toString());

        outContent.reset();

        LoopsTwo.drawTriangle(10, 0);
        String expectedOutput3 = "";
        assertEquals(expectedOutput3, outContent.toString());

        outContent.reset();

        LoopsTwo.drawTriangle(6, 1);
        String expectedOutput4 = "*\n**\n***\n****\n*****\n******\n".replace("\n",  System.lineSeparator());
        assertEquals(expectedOutput4, outContent.toString());

        outContent.reset();

        LoopsTwo.drawTriangle(0, 10);
        String expectedOutput5 = "";
        assertEquals(expectedOutput5, outContent.toString());


        System.setOut(System.out);
    }

    @Test
    public void testCalculateFactorial() {
        // Тести для факторіалів чисел 0 і 1
        assertEquals(1, LoopsTwo.calculateFactorial(0));
        assertEquals(1, LoopsTwo.calculateFactorial(1));

        // Тести для деяких додатних чисел
        assertEquals(2, LoopsTwo.calculateFactorial(2));
        assertEquals(6, LoopsTwo.calculateFactorial(3));
        assertEquals(24, LoopsTwo.calculateFactorial(4));
        assertEquals(120, LoopsTwo.calculateFactorial(5));
        assertEquals(3628800, LoopsTwo.calculateFactorial(10));
    }

    @Test
    public void testEvenOddPrinter() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Перевірка для n = 10
        int n = 10;
        LoopsTwo.evenOddPrinter(n);
        String expectedOutput = "Парні числа до 10:\n2 4 6 8 10 \nНепарні числа до 10:\n1 3 5 7 9 ".replace("\n", System.lineSeparator());
        assertEquals(expectedOutput, outContent.toString());

        // Перевірка для n = 5
        outContent.reset(); // Скидаємо вміст потоку виводу
        n = 5;
        LoopsTwo.evenOddPrinter(n);
        expectedOutput = "Парні числа до 5:\n2 4 \nНепарні числа до 5:\n1 3 5 ".replace("\n", System.lineSeparator());
        assertEquals(expectedOutput, outContent.toString());

        // Перевірка для n = 15
        outContent.reset(); // Скидаємо вміст потоку виводу
        n = 15;
        LoopsTwo.evenOddPrinter(n);
        expectedOutput = "Парні числа до 15:\n2 4 6 8 10 12 14 \nНепарні числа до 15:\n1 3 5 7 9 11 13 15 ".replace("\n", System.lineSeparator());
        assertEquals(expectedOutput, outContent.toString());

        // Перевірка для n = 1
        outContent.reset(); // Скидаємо вміст потоку виводу
        n = 1;
        LoopsTwo.evenOddPrinter(n);
        expectedOutput = "Парні числа до 1:\n\nНепарні числа до 1:\n1 ".replace("\n", System.lineSeparator());
        assertEquals(expectedOutput, outContent.toString());
    }
}
