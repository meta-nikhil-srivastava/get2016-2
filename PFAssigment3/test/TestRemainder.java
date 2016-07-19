package Session3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRemainder {
	
	Remainder obj;

	@Before
	public void setUp() throws Exception {
		obj=new Remainder();
	}

	//to check illegal method or condition
	@Test(expected = StackOverflowError.class)
	public void test() {
		assertEquals(0,obj.rem(2,0));
	}
	
	//to check correct condition
	@Test
	public void test1()
	{
		assertEquals(0,obj.rem(2, 1));
		assertEquals(1,obj.rem(100,3));
	}
	

}
