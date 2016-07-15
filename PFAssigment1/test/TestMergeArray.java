package Assignment6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMergeArray {

	MergeSort object;
	@Before
	public void setUp() throws Exception {
		object =new MergeSort();
	}

	@Test
	public void test() {
		int a[]={1,2,6,8,9};
		int b[]={3,4,5,7};
		int c[]=new int[a.length+b.length];
		int expected[]={1,2,3,4,5,6,7,8,9};
		assertArrayEquals(expected,object.join(a,a.length,b,b.length,c));
	}

}