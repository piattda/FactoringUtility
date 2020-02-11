import static org.junit.Assert.*;

import org.junit.Test;

public class FactoringUtilityTest {

	@Test
	public void testAFactor1() {
	    /*
	     * Set up variables and call method under test
	     */
	    int n = 1;
	    int factor = FactoringUtility.aFactor(n);
	    /*
	     * Assert that values of variables match expectations
	     */
	    assertEquals(1, factor);
	}
	
	@Test
	public void aNonTrivialFactorV1(){
		/*
		 * Set up variables and call method under test
		 */
		int n = 6;
		int factor = FactoringUtility.aNonTrivialFactorV1(n);
		/*
		 * Assert that values of variables match expectations.
		 */
		assertEquals(3, factor);
		assertEquals(2,factor);
	}

}
