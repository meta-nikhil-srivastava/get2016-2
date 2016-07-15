package Session2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPattern2 {

	DrawPattern2 obj;
	@Before
	public void setUp() throws Exception {
		obj=new DrawPattern2();
	}

	@Test
	//to test the no of spaces
	public void test1(){
		assertEquals("",obj.spaceCount(1, 5));
		assertEquals(" ",obj.spaceCount(2, 5));
		assertEquals("  ",obj.spaceCount(3, 5));
		assertEquals("   ",obj.spaceCount(4, 5));
		assertEquals("    ",obj.spaceCount(5, 5));

	}
	
	@Test
	//to test arrangement of numbers
	public void test2() {

		assertEquals("12345",obj.numbersSequence(1, 5));
		assertEquals("1234",obj.numbersSequence(2, 5));
		assertEquals("123",obj.numbersSequence(3, 5));
		assertEquals("12",obj.numbersSequence(4, 5));
		assertEquals("1",obj.numbersSequence(5, 5));
	}

	@Test
	//to test whole pattern Arrangement
	public void test3() {
		String expected[]={"12345"," 1234","  123","   12","    1"};

		assertArrayEquals(expected,obj.pattern(5));
	}
}
