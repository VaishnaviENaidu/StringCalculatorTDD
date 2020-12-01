
public class Splitter {
	protected String[] split(String string) {
		String delimeters = extractDelimeters(string);
		String[] values = extractValues(string, delimeters);
		return values;
	}


	private String[] extractValues(String string, String delimeters) {
		if(string.startsWith("//"))
		string =string.substring(4);
			String[] values=string.split(delimeters);
		return values;
	}


	private String extractDelimeters(String string) {
		String delimeters = ",|\n";
		if(string.startsWith("//"))
          delimeters+="|" +string.substring(2,3);
		return delimeters;
	}
}
