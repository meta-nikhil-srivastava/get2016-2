package Session2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPattern1 {

	DrawPattern1 object;
	@Before
	public void setUp() throws Exception {
		object=new DrawPattern1();
	}

	@Test
	//to test the no of spaces
	public void test1() {

		assertEquals("    ",object.spaceCount(1, 5));
		assertEquals("   ",object.spaceCount(2, 5));
		assertEquals("  ",object.spaceCount(3, 5));
		assertEquals(" ",object.spaceCount(4, 5));
		assertEquals("",object.spaceCount(5, 5));
	}
	
	@Test
	//to test arrangement of numbers
	public void test2() {

		assertEquals("1",object.numbersSequence(1, 5));
		assertEquals("121",object.numbersSequence(2, 5));
		assertEquals("12321",object.numbersSequence(3, 5));
		assertEquals("1234321",object.numbersSequence(4, 5));
		assertEquals("123454321",object.numbersSequence(5, 5));
	}
	
	@Test
	//to test whole pattern Arrangement
	public void test3() {
		String expected[]={"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};

		assertArrayEquals(expected,object.patternArrangement(5));
	}

}
