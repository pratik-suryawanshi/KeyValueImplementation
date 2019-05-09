package com.keyvalue.kvimplementation;

import java.util.HashMap;
import java.util.Map;

public class DummyDatabaseClass {
	

	private static Map<Long, keyValueModelClass> messages = new HashMap<>();
	public static Map<Long, keyValueModelClass> getMessages() 
	{
		return messages;

	}
}
