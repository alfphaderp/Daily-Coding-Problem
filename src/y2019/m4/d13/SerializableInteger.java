package y2019.m4.d13;

/**
 * A serializable integer as an example object which can be stored in the tree.
 */
public class SerializableInteger implements StringSerializable {
	private final int val;
	
	public SerializableInteger(int val) {
		this.val = val;
	}

	@Override
	public String serialize() {
		return Integer.toString(val);
	}

	@Override
	public Object deserialize(String str) {
		return Integer.parseInt(str);
	}
}
