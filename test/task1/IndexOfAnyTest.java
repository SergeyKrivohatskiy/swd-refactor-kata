package task1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IndexOfAnyTest {

    static final char[] SEARCH_CHARS = { '1', '2', '3' };

    @Test
    public void emptyInputsTest() {
	assertEquals(-1, IndexOfAny.indexOfAny("", new char[0]));
	assertEquals(-1, IndexOfAny.indexOfAny("12", new char[0]));
	assertEquals(-1, IndexOfAny.indexOfAny("", new char[1]));
    }

    @Test
    public void lastSymbolTest() {
	assertEquals(2, IndexOfAny.indexOfAny("001", SEARCH_CHARS));
	assertEquals(2, IndexOfAny.indexOfAny("002", SEARCH_CHARS));
	assertEquals(2, IndexOfAny.indexOfAny("003", SEARCH_CHARS));
	assertEquals(0, IndexOfAny.indexOfAny("300", SEARCH_CHARS));
	assertEquals(1, IndexOfAny.indexOfAny("030", SEARCH_CHARS));
    }

    @Test
    public void goodResultTest() {
	assertEquals(0, IndexOfAny.indexOfAny("120", SEARCH_CHARS));
	assertEquals(1, IndexOfAny.indexOfAny("012", SEARCH_CHARS));
	assertEquals(0, IndexOfAny.indexOfAny("230", SEARCH_CHARS));
	assertEquals(1, IndexOfAny.indexOfAny("023", SEARCH_CHARS));
    }

    @Test
    public void badResultTest() {
	assertEquals(0, IndexOfAny.indexOfAny("120", SEARCH_CHARS));
	assertEquals(1, IndexOfAny.indexOfAny("012", SEARCH_CHARS));
	assertEquals(0, IndexOfAny.indexOfAny("230", SEARCH_CHARS));
	assertEquals(1, IndexOfAny.indexOfAny("023", SEARCH_CHARS));
    }
}