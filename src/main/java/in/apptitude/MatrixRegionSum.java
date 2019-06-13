package in.apptitude;

//http://www.ardendertat.com/2011/09/20/programming-interview-questions-2-matrix-region-sum/
public class MatrixRegionSum {

	public static void main(String[] args) {
		int a[][] = { { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 3 }, { 4, 4, 4, 4, 4 }, { 5, 5, 5, 5, 5 } };

		int b[][] = { { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 }, { 3, 8, 6, 7, 3 }, { 4, 4, 4, 4, 4 }, { 5, 5, 5, 5, 5 } };

		for(int x=0;x < b.length;x++) {
			for(int y=0;y<b[0].length-1;y++) {
				
			}
		}
		int result = new MatrixRegionSum().maximumSum(b, 0, 0, b.length - 1, b[0].length - 1);
		System.out.println(result);
	}

	// @Benchmark
	private int maximumSum(int[][] matrix, int x1, int y1, int x2, int y2) {

		System.out.println("Eval: " + x1 + "," + y1 + "::" + x2 + "," + y2);

		int maximumSum = 0;
		int currentSum;
		if (x1 >= x2 || y1 >= y2) {
			return 0;
		}
		currentSum = maximumSum(matrix, x1 + 1, y1, x2, y2);
		if (currentSum > 0) {
			maximumSum = currentSum;
		}
		currentSum = maximumSum(matrix, x1 + 1, y1 + 1, x2, y2);
		if (currentSum > 0) {
			maximumSum = currentSum;
		}
		currentSum = maximumSum(matrix, x1, y1 + 1, x2, y2);
		if (currentSum > 0) {
			maximumSum = currentSum;
		}
		currentSum = maximumSum(matrix, x1 + 1, y1, x2 - 1, y2);
		if (currentSum > 0) {
			maximumSum = currentSum;
		}
		currentSum = maximumSum(matrix, x1 + 1, y1 + 1, x2 - 1, y2);
		if (currentSum > 0) {
			maximumSum = currentSum;
		}
		currentSum = maximumSum(matrix, x1, y1 + 1, x2 - 1, y2);
		if (currentSum > 0) {
			maximumSum = currentSum;
		}
		currentSum = maximumSum(matrix, x1 + 1, y1, x2 - 1, y2 - 1);
		if (currentSum > 0) {
			maximumSum = currentSum;
		}
		currentSum = maximumSum(matrix, x1 + 1, y1 + 1, x2 - 1, y2 - 1);
		if (currentSum > 0) {
			maximumSum = currentSum;
		}
		currentSum = maximumSum(matrix, x1, y1 + 1, x2 - 1, y2 - 1);
		if (currentSum > 0) {
			maximumSum = currentSum;
		}

		currentSum = maximumSum(matrix, x1 + 1, y1, x2, y2 - 1);
		if (currentSum > 0) {
			maximumSum = currentSum;
		}
		currentSum = maximumSum(matrix, x1 + 1, y1 + 1, x2, y2 - 1);
		if (currentSum > 0) {
			maximumSum = currentSum;
		}
		currentSum = maximumSum(matrix, x1, y1 + 1, x2, y2 - 1);
		if (currentSum > 0) {
			maximumSum = currentSum;
		}
		return maximumSum;

	}

}
