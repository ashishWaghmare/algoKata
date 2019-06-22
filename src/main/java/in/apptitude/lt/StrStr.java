package in.apptitude.lt;

//https://leetcode.com/problems/implement-strstr/
public class StrStr {

	public static void main(String[] args) {
		System.out.println(" Needle Found at " + find("hello", "ll"));
		System.out.println(" Needle Found at " + find("aaaaa", "bba"));

	}

	private static int find(String haystack, String needle) {
		int found = -1;
		int j = 0;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(j)) {
				j++;
			} else {
				j = 0;
			}
			if (j == needle.length()) {
				found = i - j + 1;
				break;
			}
		}
		return found;
	}
}
