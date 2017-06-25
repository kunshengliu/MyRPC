package com.nia.rpc.core.serializer;

public interface Serializer {
	byte[]  serialize(Object object);
	<T> T deserialize(byte []  bytes);
}
