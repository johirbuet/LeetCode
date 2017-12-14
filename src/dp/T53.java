package dp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class T53 {

	P53 p;
	@Before
	public void init() {
		p = new P53();
	}
	@Test
	public void somecases() {
		
		int [] a = {-2,1,-3,4,-1,2,1,-5,4};
		int maxsum = 6;
		assertEquals(maxsum, p.maxsubarraysum(a));
	}
	
	@Test
	public void testNegative() {
		int [] a = {-6,-5,-2};
		int maxsum = -2;
		assertEquals(maxsum, p.maxsubarraysum(a));
	}

}
