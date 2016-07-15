package Assignment4;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestFCFS {


	@Before
	public void setUp() throws Exception {
	}
	int at[] ={1,5,9,25} ;
	int et[] ={12,7,2,5} ;
	
	int expected[][] ={{0,1,12},{8,13,19},{11,20,21},{0,25,29}} ;

	@Test
	public void test() {
		FCFS conversion= new FCFS();
		assertArrayEquals(expected,conversion.FirstComeFirstServe(at, et));
			
	}

}
