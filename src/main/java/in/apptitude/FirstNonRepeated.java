package in.apptitude;

//http://www.ardendertat.com/2011/11/14/programming-interview-questions-15-first-non-repeated-character-in-string/
public class FirstNonRepeated {

	public static void main(String[] args) {
		String input = "AAAAAABC";
		int start = 'A';
		boolean[] found = new boolean[92];
		for (char c : input.toCharArray()) {
			int pos = c - start;
			if (found[pos] == true) {
				found[pos] = false;
			} else {
				found[pos] = true;
			}
		}

		for (int i = 0; i < found.length; i++) {
			if (found[i]) {
				System.out.printf("Non Repeated Char %c", start + i);
			}
		}

	}

}
