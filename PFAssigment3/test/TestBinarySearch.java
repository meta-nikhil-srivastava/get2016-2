package Session3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Session3.BinarySearch;

public class TestBinarySearch {

	BinarySearch obj;
	@Before
	public void setUp() throws Exception {
		obj=new BinarySearch();
	}

	@Test
	public void test() {

		int input1[]={2,5,8,9,10,55,77};
		assertEquals(-1,obj.findElenemt(input1, 0, input1.length-1, 88));
		assertEquals(7,obj.findElenemt(input1, 0, input1.length-1, 77));
	}

}