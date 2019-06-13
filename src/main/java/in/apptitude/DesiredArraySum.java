package in.apptitude;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//http://www.ardendertat.com/2011/09/17/programming-interview-questions-1-array-pair-sum/
public class DesiredArraySum {

	public static void main(String[] args) {
		int desiredSum = 16;
		int[] inputArray = { 10, 12, 13, 15, 4, 3, 1, 8, 8 };
		List<Integer> list = Arrays.stream(inputArray).boxed().collect(Collectors.toList());
		Collections.sort(list);

		int x = 0;
		int y = list.size() - 1;
		while (x <= y) {
			int potentialX = list.get(x);
			int potentialY = list.get(y);
			int sum = potentialX + potentialY;
			if (desiredSum == sum) {
				System.out.print(potentialX + " " + potentialY);
				x = x + 1;
				y = y - 1;
			} else if (desiredSum > sum) { // Carefull
				x = x + 1;
			} else if (desiredSum < sum) { // Carefull
				y = y - 1;
			}
			System.out.println(" ");
		}
	}
}
