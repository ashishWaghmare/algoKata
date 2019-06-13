package in.apptitude;

// https://github.com/bephrem1/backtobackswe/blob/master/Dynamic%20Programming%2C%20Recursion%2C%20%26%20Backtracking/maxContiguousSubarraySum.java
// https://www.youtube.com/watch?v=-FgseNO-6Gk&t=378s
// http://www.ardendertat.com/2011/09/24/programming-interview-questions-3-largest-continuous-sum/
public class MaximumSum {

	public static void main(String[] args) {
		int[] values = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = Integer.MIN_VALUE;
		int runningMax = values[0];
		// Extension or Choose one
		for (int i = 1; i < values.length; i++) {
			int currentValue = values[i];
			int extendedValue = runningMax + currentValue;
			if (currentValue > extendedValue) {
				runningMax = currentValue;
				System.out.println(runningMax + "Starting again" + currentValue);

			} else {
				runningMax = extendedValue;
				System.out.println(runningMax + "Extending again" + currentValue);
			}
			result = Math.max(runningMax, result);
		}
		System.out.println(result);
	}
}
