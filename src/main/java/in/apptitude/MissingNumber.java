package in.apptitude;

//http://www.ardendertat.com/2011/09/27/programming-interview-questions-4-find-missing-element/
public class MissingNumber {

	public static void main(String[] args) {

		int[] arr1 = { 4, 1, 0, 2, 9, 6, 8, 7, 5, 3 };
		int[] arr2 = { 6, 4, 7, 2, 1, 0, 8, 3, 9 };

		int x = 0;
		for (int val1 : arr1) {
			x = x ^ val1;
		}
		for (int val2 : arr2) {
			x = x ^ val2;
		}
		System.out.println("Missing Number:" + x);
	}

}
