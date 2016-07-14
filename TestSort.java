package Assignment5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSort {

	Sort object;
	@Before
	public void setUp() throws Exception {
		object=new Sort();
	}

	@Test
	public void test() {
	
		int input1[]={1,2,3,2,3,4,5,3,4};
		int input2[]={1,2,3,4,5,6,7,8};
		int input3[]={9,8,7,6,5,4,3,2,1};
		assertEquals(0,object.checkSort(input1));
		assertEquals(1,object.checkSort(input2));
		assertEquals(2,object.checkSort(input3));
	}

}
