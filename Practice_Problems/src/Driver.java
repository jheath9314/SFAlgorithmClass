
public class Driver {

	public String r;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "abcd";

		System.out.print(Driver.recursiveStringReverse(test));

	}

	public static String recursiveStringReverse(String s) {
		if (s.length() == 1) {
			return s;
		} else {
			return s.charAt(s.length() - 1) + recursiveStringReverse(s.substring(0, s.length() - 1));
		}
	}

}
