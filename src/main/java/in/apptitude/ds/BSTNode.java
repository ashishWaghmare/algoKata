package in.apptitude.ds;

import lombok.Data;

@Data
public class BSTNode {
	int value;
	BSTNode left;
	BSTNode right;

	public BSTNode(int value) {
		this.value = value;
	}
}
