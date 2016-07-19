package Session3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestQuickSort {

	QuickSort obj;
	@Before
	public void setUp() throws Exception {
		obj= new QuickSort();
	}

	@Test
	public void test() {
		int input[]={2,5,8,9,10,77,55,11};
		int expected[]={2,5,8,9,10,11,55,77};
		assertArrayEquals(expected,obj.sorting(input,0,input.length-1));
	}

}
