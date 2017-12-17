package dp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class T121 {

	P121 p;
	@Before
	public void init() {
		p = new P121();
	}
	
	@Test
	public void test() {
		int [] P = {7, 1, 5, 3, 6, 4};
		assertEquals(5, p.maxProfit(P));
		int [] Q = {7,5,4,3,2,1};
		assertEquals(0, p.maxProfit(Q));
	}

}
