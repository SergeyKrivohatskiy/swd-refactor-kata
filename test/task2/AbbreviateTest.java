package task2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AbbreviateTest {
    @Test
    public void nullTest() {
	assertNull(Abbreviate.abbreviate(null, 124));
    }

    @Test(expected = IllegalArgumentException.class)
    public void lowWidthTest() {
	Abbreviate.abbreviate("", 3);
    }

    @Test
    public void abbreviatedTest() {
	assertEquals("1...", Abbreviate.abbreviate("12345678", 4));
	assertEquals("1234...", Abbreviate.abbreviate("12345678", 7));
    }

    @Test
    public void enoughtWidthForStringTest() {
	assertEquals("12345678", Abbreviate.abbreviate("12345678", 8));
	assertEquals("12345678", Abbreviate.abbreviate("12345678", 12346));
    }
}