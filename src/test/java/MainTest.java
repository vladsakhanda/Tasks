import my.org.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Dictionary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import my.org.Main;

public class MainTest {
    private Main main = new Main();

    @Test
    public void powerTest() {
        assertEquals(0, main.power(0), 0.2);
        assertEquals(1, main.power(0), 0.2);
        assertEquals(4, main.power(0), 0.2);
        assertEquals(1, main.power(0), 0.2);
        assertEquals(4, main.power(0), 0.2);
        assertEquals(240.25f, main.power(0), 0.2);
    }

    @Test
    public void accessTest() {
        assertEquals("Серйозно? І це твій пароль?!", main.access("12345"));
        assertEquals("Доступ надано!", main.access("correct password"));

        assertEquals("Доступ відмовлено!", main.access("correw"));
        assertEquals("Доступ відмовлено!", main.access(""));
        assertEquals("Доступ відмовлено!", main.access("fsdb,f"));
        assertEquals("Доступ відмовлено!", main.access("1234"));
        assertEquals("Доступ відмовлено!", main.access("123456"));
        assertEquals("Доступ відмовлено!", main.access("correctpassword"));
    }

    @Test
    public void evenOrOddTest() {
        assertEquals("Парне", main.evenOrOdd(2));
        assertEquals("Парне", main.evenOrOdd(4));
        assertEquals("Парне", main.evenOrOdd(10));
        assertEquals("Парне", main.evenOrOdd(28));
        assertEquals("Парне", main.evenOrOdd(444));

        assertEquals("Непарне", main.evenOrOdd(1));
        assertEquals("Непарне", main.evenOrOdd(3));
        assertEquals("Непарне", main.evenOrOdd(999));
        assertEquals("Непарне", main.evenOrOdd(78));
        assertEquals("Непарне", main.evenOrOdd(5));

        assertNull(main.evenOrOdd(0));
        assertNull(main.evenOrOdd(-1));
        assertNull(main.evenOrOdd(-2));
    }

    @Test
    public void encryptWordTest() {
        assertEquals('b', main.encryptWord('a', 1));
        assertEquals('a', main.encryptWord('b', -1));
        assertEquals('b', main.encryptWord('g', -5));
        assertEquals('n', main.encryptWord('d', 10));
        assertEquals('Q', main.encryptWord('d', 26));
        assertEquals('z', main.encryptWord('a', 25));
    }

}
