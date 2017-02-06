package it.salz;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PngGeneratorTest extends TestCase {
	public PngGeneratorTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(PngGeneratorTest.class);
	}

	public void testApp() {
		assertTrue(true);
	}
}
