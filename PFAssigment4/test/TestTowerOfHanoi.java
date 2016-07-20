package session4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TestTowerOfHanoi {

	TowerOfHanoi obj;
	@Before
	public void setUp() throws Exception {
		obj=new TowerOfHanoi();
	}

	@Test
	public void test() {
		
		//list of movement of disk
		  List<String> expected = Arrays.asList("MoveDisk 1 From A to C", 
				  								"MoveDisk 2 From A to B",
				  								"MoveDisk 1 From C to B",
				  								"MoveDisk 3 From A to C",
				  								"MoveDisk 1 From B to A",
				  								"MoveDisk 2 From B to C",
				  								"MoveDisk 1 From A to C");
		  
		  //assert check
		  assertEquals(expected, obj.TOH("A", "B", "C", 3));
	}

}
