package y2019.m4.d13;

/**
 * Node of a generic, serializable binary tree.
 */
public class Node<T extends StringSerializable> implements StringSerializable {
	private T val;
	private Node<T> left, right;
	
	public Node(T val) {
		this.val = val;
	}
	
	public Node(T val, Node<T> left, Node<T> right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String serialize() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		if(val != null)
			sb.append(val.serialize());
		if(left != null || right != null) {
			sb.append(left != null ? left.serialize() : "[]");
			sb.append(right != null ? right.serialize() : "[]");
		}
		sb.append("]");
		return sb.toString();
	}
	
	@Override
	public static <T> Node<? extends T> deserialize(String str) {
		new Node<T>(null);
		// Arghh. I hate generics.
		
		return null;
	}
}