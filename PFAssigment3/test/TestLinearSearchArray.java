package Session3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLinearSearchArray {

	LinearSearchArray obj;
	@Before
	public void setUp() throws Exception {
		obj=new LinearSearchArray();
	}

	@Test
	public void test() {
		int input1[]={2,5,8,9,10,55,77};
		assertEquals(-1,obj.LinearSearching(input1, 88,0));
		assertEquals(7,obj.LinearSearching(input1, 77,0));
	}

}
