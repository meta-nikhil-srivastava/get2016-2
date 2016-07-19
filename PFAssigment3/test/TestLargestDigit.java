package Session3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLargestDigit {

	LargestDigit obj;

	@Before
	public void setUp() throws Exception {
		obj=new LargestDigit();
	}

	
	@Test
	public void test1()
	{
		assertEquals(2,obj.findLargestDigit(2));
		assertEquals(9,obj.findLargestDigit(1257369));
		assertEquals(4,obj.findLargestDigit(444));
	}
}
