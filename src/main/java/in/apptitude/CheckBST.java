package in.apptitude;

import in.apptitude.ds.BSTNode;

//http://www.ardendertat.com/2011/10/10/programming-interview-questions-7-binary-search-tree-check/
public class CheckBST {

	public static void main(String[] args) {
		BSTNode root = new BSTNode(3);
		root.setLeft(new BSTNode(2));
		root.setRight(new BSTNode(5));
		root.getLeft().setLeft(new BSTNode(1));
		root.getLeft().setRight(new BSTNode(4));

		if (validNode(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
			System.out.println("Correct BST");
		} else {
			System.out.println("In-Correct BST");
		}

		BSTNode root1 = new BSTNode(15);
		root1.setLeft(new BSTNode(8));
		root1.setRight(new BSTNode(20));
		root1.getLeft().setLeft(new BSTNode(1));
		root1.getLeft().setRight(new BSTNode(10));

		if (validNode(root1, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
			System.out.println("Correct BST");
		} else {
			System.out.println("In-Correct BST");
		}

	}

	// Wrong Answer
	public static boolean validNode(BSTNode node, int minValue, int maxValue) {
		if (node == null) {
			return true;
		}

		if (!(minValue <= node.getValue() && node.getValue() <= maxValue)) {
			System.out.println("Not:: " + minValue + "<=" + node.getValue() + "<= " + maxValue);
			return false;
		}

		return validNode(node.getLeft(), minValue, node.getValue())
				&& validNode(node.getRight(), node.getValue(), maxValue);
	}
}
