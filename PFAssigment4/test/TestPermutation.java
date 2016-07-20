package session4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestPermutation {

	PermutationOfLetter obj;
	@Before
	public void setUp() throws Exception {
		obj=new PermutationOfLetter();
	}

	@Test
	public void test() {

		List<String> expected = Arrays.asList("ABC","ACB","BAC","BCA","CAB","CBA");

//assert check
assertEquals(expected, obj.combinations("ABC"));
	}

}
