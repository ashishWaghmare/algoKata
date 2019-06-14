package in.apptitude;

//http://www.ardendertat.com/2011/10/10/programming-interview-questions-7-binary-search-tree-check/
public class CheckBST {

	public static void main(String[] args) {
		BSTNode root = new BSTNode(3);
		root.left = new BSTNode(2);
		root.right = new BSTNode(5);
		root.left.left = new BSTNode(1);
		root.left.right = new BSTNode(4);

		if (validNode(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
			System.out.println("Correct BST");
		} else {
			System.out.println("In-Correct BST");
		}

		BSTNode root1 = new BSTNode(15);
		root1.left = new BSTNode(8);
		root1.right = new BSTNode(20);
		root1.left.left = new BSTNode(1);
		root1.left.right = new BSTNode(10);

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

		if (!(minValue <= node.value && node.value <= maxValue)) {
			System.out.println("Not:: " + minValue + "<=" + node.value + "<= " + maxValue);
			return false;
		}

		return validNode(node.left, minValue, node.value) && validNode(node.right, node.value, maxValue);
	}
}

class BSTNode {
	int value;
	BSTNode left;
	BSTNode right;

	BSTNode(int value) {
		this.value = value;
	}
}
