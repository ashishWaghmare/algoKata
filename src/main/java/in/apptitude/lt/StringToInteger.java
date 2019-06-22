package in.apptitude.lt;

//https://leetcode.com/problems/string-to-integer-atoi/
public class StringToInteger {

	public static void main(String[] args) {
		String stringNumber = "123";
		int intValue = 0;
		int ZERO_ASCII = '0';
		for (int i = 0; i < stringNumber.length(); i++) {
			int value = stringNumber.charAt(i) - ZERO_ASCII;
			if (value < 10) {
				intValue = intValue * 10 + value;
			} else {
				new IllegalArgumentException();
			}
		}
		System.out.println(intValue);
	}

}
