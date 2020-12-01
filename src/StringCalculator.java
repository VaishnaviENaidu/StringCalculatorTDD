
public class StringCalculator {

	public int Add(String string) {
		if("".equals(string))
		return 0;
		String[] values=string.split(",|\n");
	return addArray(values);
	}

	
	private int addArray(String[] values) {
		int sum=0;
		for(String value:values) {
			sum+=toInt(value);
		}
		return sum;
	}

	private int toInt(String value) {
		return Integer.valueOf(value);
	}

}
