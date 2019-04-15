package y2019.m4.d13;

/**
 * This problem was asked by Google.
 * 
 * Given the root to a binary tree, implement serialize(root), which serializes
 * the tree into a string, and deserialize(s), which deserializes the string
 * back into the tree.
 * 
 * For example, given the following Node class
 * class Node:
 *     def __init__(self, val, left=None, right=None):
 *         self.val = val
 *         self.left = left
 *         self.right = right
 * The following test should pass:
 * node = Node('root', Node('left', Node('left.left')), Node('right'))
 * assert deserialize(serialize(node)).left.left.val == 'left.left'
 * 
 * Note: I know the problem was given in Python, but I'm more comfortable with
 * Java, so I'll be using that instead.
 * 
 * TODO: Finish
 */
public class Main {	
	public static void main(String[] args) {
		Node<SerializableInteger> root = new Node<>(new SerializableInteger(1),
				new Node<>(new SerializableInteger(0),
						new Node<>(new SerializableInteger(-1)),
						null
						),
				new Node<>(new SerializableInteger(2))
				);
		
		System.out.println(root.serialize());
	}
}
