import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {
StringCalculator cal=new StringCalculator();

private void checkAdd(String string,int expected) {
	assertEquals(expected,cal.Add(string));
}

@Test
public void returnOnEmpty() {
	checkAdd("",0);
	}

@Test
public void returnNum() {
	checkAdd("1",1);
	}

@Test
public void returnSum() throws Exception{
	checkAdd("1,2",3);
	checkAdd("1,2,3",6);
	
}


@Test
public void  AcceptNewLineAsDelimeter() throws Exception {
	checkAdd("1\n2,3",6);
}

@Test
public void AcceptAnyDelimeter() throws Exception{
	checkAdd("//;\n1;3",4);
}

@Test
public void exceptionWithNegatives() throws Exception{
	try{
		checkAdd("-3,2,-23,5",0);
	}
	catch(Exception e) {
		assertEquals("Negatives Not Allowed: -3,-23",
				      e.getMessage());
	}
}

















}
