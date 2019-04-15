package y2019.m4.d13;

/**
 * Defines a class to be able to be serialized and deserialized into a String
 */
public interface StringSerializable {
	public String serialize();
	public Object deserialize(String str);
}