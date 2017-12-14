package dp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class T70 {

	P70 p;
	@Before
	public void init() {
		p = new P70();
	}
	
	@Test
	public void testCases() {
		int n = 2;
		assertEquals(2, p.climbStairs(n));
		n = 10;
		assertEquals(89, p.climbStairs(n));
	}
	

}
