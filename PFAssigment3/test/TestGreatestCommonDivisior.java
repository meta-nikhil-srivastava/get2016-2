package Session3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGreatestCommonDivisior {

	GreatestCommonDivisor obj;

	@Before
	public void setUp() throws Exception {
		obj=new GreatestCommonDivisor();
	}

	
	@Test
	public void test1()
	{
		assertEquals(1,obj.findGCD(2, 1));
		assertEquals(6,obj.findGCD(12, 18));
		assertEquals(1,obj.findGCD(100,3));
	}
}
