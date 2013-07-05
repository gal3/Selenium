import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class MyClassTest {

	  @BeforeClass
	  public static void testSetup() {
	  }
	
	  @AfterClass
	  public static void testCleanup() {
	    // Teardown for data used by the unit tests
	  }
	
	  @Test(expected = IllegalArgumentException.class)
	  public void testExceptionIsThrown() {
	    MyClass tester = new MyClass();
	    tester.multiply(1000, 5);
	  }
	
	  @Test
	  public void testMultiply() {
	    MyClass tester = new MyClass();
	    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	  }
	  
	  @Test
	  public void testNegMultiply() {
	    MyClass tester = new MyClass();
	    assertEquals("10 x -5 must be -50", -50, tester.multiply(10, -5));
	  }
	  
	  @Test
	  public void testZeroMultiply() {
	    MyClass tester = new MyClass();
	    assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
	  }
}
