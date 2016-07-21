package session1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMatrix {

	Matrix obj;
	Matrix obj2;
	@Before
	public void setUp() throws Exception {
		obj=new Matrix(2,2);
		obj.addElement(0, 0, 1);
		obj.addElement(0, 1, 2);
		obj.addElement(1, 0, 3);
		obj.addElement(1, 1, 4);
		obj2=obj.TransposeMatrix();
		
	}

	@Test
	public void testaddElement() {
		assertEquals(true,obj.addElement(0, 0, 1));
		assertEquals(true,obj.addElement(0, 1, 2));
		assertEquals(true,obj.addElement(1, 0, 3));
		assertEquals(true,obj.addElement(1, 1, 4));
		assertEquals(false,obj.addElement(1, 2, 2));
	}
	
	@Test
	public void testshow()
	{
		
		int expected[][]={{1,2},{3,4}};
		assertArrayEquals(expected, obj.show());
	}
	
	@Test
	public void testTranspose()
	{
		obj2=obj.TransposeMatrix();
		int expected[][]={{1,3},{2,4}};
		assertArrayEquals(expected, obj2.show());
	}
	
	@Test
	public void testMultiplication()
	{
		Matrix obj3=obj.matrixMultiplication(obj2);
		int expected[][]={{5,11},{11,25}};
		assertArrayEquals(expected, obj3.show());
	}

}