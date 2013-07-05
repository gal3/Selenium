import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyParameterizedClassTest {

  private int multiplier1;
  private int multiplier2;

  public MyParameterizedClassTest(int testParameter, int testParameter2) {
    this.multiplier1 = testParameter;
    this.multiplier2 = testParameter2;
    
  }

  // Creates the test data
  @Parameters
  public static Collection<Object[]> data() {
    Object[][] data = new Object[][] { { 1,2 }, { 5,6 }, { 7,8 } };
    return Arrays.asList(data);
  }

  @Test
  public void testMultiplyException() {
    MyClass tester = new MyClass();
    assertEquals("Result", multiplier1 * multiplier2,
        tester.multiply(multiplier1, multiplier2));
  }

}
 