package Assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRemoveDuplicate {
	
	 RemoveDuplicateNumber object;
	@Before
	public void setUp() throws Exception {
		object=new RemoveDuplicateNumber();
	}

	@Test
	public void test() {
		int input[]={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int expected[]={2,5,4,6,3,8,9,0};

		assertArrayEquals(expected,object.removeDupilicate(input));
	}

}
