package Assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBinaryToOctal {
	
	BinaryToOctal object;

	@Before
	public void setUp() throws Exception {
		object=new BinaryToOctal();
	}

	@Test
	public void testConvertBinaryToOctal() {
		assertEquals(15, object.convertBinaryToOctal(1101));
		assertEquals(54, object.convertBinaryToOctal(101100));
	}

}
