import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {
StringCalculator cal=new StringCalculator();

@Test
public void returnOnEmpty() {
	assertEquals(0,cal.Add(""));
}

@Test
public void returnNum() {
	assertEquals(1,cal.Add("1"));
}


























}
