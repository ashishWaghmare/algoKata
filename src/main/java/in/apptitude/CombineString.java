package in.apptitude;

//http://www.ardendertat.com/2011/10/10/programming-interview-questions-6-combine-two-strings/
public class CombineString {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "def";
		String combinedString = "deabcf";
		int index1 = 0;
		int index2 = 0;
		for (int combinedIndex = 0; combinedIndex < combinedString.length(); combinedIndex++) {
			if (index1 < str1.length() && combinedString.charAt(combinedIndex) == str1.charAt(index1)) {
				index1++;
			} else if (index2 < str2.length() && combinedString.charAt(combinedIndex) == str2.charAt(index2)) {
				index2++;
			} else {
				System.out.println("Illegal Combination");
				return;
			}
		}
		if (index1 >= str1.length() && index2 >= str2.length()) {
			System.out.println("Legal Combination");
		} else {
			System.out.println("Unkown");
		}
	}
}
