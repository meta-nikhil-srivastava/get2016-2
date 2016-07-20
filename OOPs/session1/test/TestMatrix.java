package session1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMatrix {

	Matrix1 obj;
	@Before
	public void setUp() throws Exception {
		obj=new Matrix1(2,2);
	}

	@Test
	public void testaddElement() {
		assertEquals(true,obj.addElement(1, 1, 2));
		assertEquals(false,obj.addElement(1, 2, 2));
	}

}
