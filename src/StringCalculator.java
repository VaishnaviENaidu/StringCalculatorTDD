
public class StringCalculator {

	public int Add(String string) {
		// TODO Auto-generated method stub
		if("".equals(string))
		return 0;
		String[] values=string.split(",");
		int sum=0;
		for(String value:values) {
			sum+=Integer.valueOf(value);
		}
			return sum;
	}

}
