package Assignment3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLongestSequence {

	LongestSequenceArray object;
	@Before
	public void setUp() throws Exception {
		object=new LongestSequenceArray();
	}

	@Test
	public void test() {
		int input[]={1,2,3,2,3,4,5,3,4,2,3,4,5,6,7,8,1,2,4,5,6,5,7,8,9};
		int expected[]={2,3,4,5,6,7,8};

		assertArrayEquals(expected,object.findLongestSquence(input));
	}

}
