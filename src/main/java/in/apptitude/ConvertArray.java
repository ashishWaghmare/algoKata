package in.apptitude;

import java.util.Arrays;

public class ConvertArray {

	public static void main(String[] args) {
		// 0-a1,1-a2,2-a3,3-a4,4-aN,5-b1,b2,...bN,c1,c2,...cN
		// x = 0,1,2 ,3 ,4 , 5 , 6 ,7 ,8 ,9
		// x'= 0N,N,2N,0N+1,1N+1,2N+1,0N+2,1N+2,1N+2,2N+2,
		// y = 0 ,1,2 ,3 ,4 , 5 , 6 ,7 ,8 ,9
		// a1,b1,c1,a2,b2,c2,........,aN,bN,cN

		String[] input = { "a1", "a2", "a3", "a4", "a5", "b1", "b2", "b3", "b4", "b5", "c1", "c2", "c3", "c4", "c5", };
		int N = 5;
		int X = input.length / N;
		String tmp;
		for (int sourceIndex = 0; sourceIndex < input.length; sourceIndex++) {
			System.out.println(sourceIndex);
			int targetIndex = getIndex(sourceIndex, X, N);

			// No idea why is this
			while (targetIndex < sourceIndex) {
				targetIndex = getIndex(targetIndex, X, N);
				System.out.println(sourceIndex + "::" + targetIndex);
			}

			tmp = input[targetIndex];
			input[targetIndex] = input[sourceIndex];
			input[sourceIndex] = tmp;
		}
		System.out.println(Arrays.toString(input));
	}

	private static int getIndex(int x, int X, int N) {
		return (x / X) + (x % X) * N;
	}

}
