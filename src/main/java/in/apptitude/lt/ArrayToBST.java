package in.apptitude.lt;

import java.util.Arrays;

import in.apptitude.ds.BSTNode;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class ArrayToBST {

	// Given an array where elements are sorted in ascending order, convert it to a
	// height
	// balanced BST
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6 };
		BSTNode root = makeTree(input);
		System.out.println(root);
	}

	private static BSTNode makeTree(int[] input) {
		int midIndex = input.length / 2;
		BSTNode root = new BSTNode(input[midIndex]);
		if (midIndex >= 1) {
			root.setLeft(makeTree(Arrays.copyOfRange(input, 0, midIndex)));
		}
		if (input.length - midIndex > 1) {
			root.setRight(makeTree(Arrays.copyOfRange(input, midIndex + 1, input.length))); // 3,5
		}
		return root;
	}

}
