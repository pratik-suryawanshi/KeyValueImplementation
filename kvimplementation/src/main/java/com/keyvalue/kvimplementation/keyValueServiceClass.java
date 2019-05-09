package com.keyvalue.kvimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class keyValueServiceClass {
	
	private Map<Long, keyValueModelClass> messages = DummyDatabaseClass.getMessages();
	
	public keyValueServiceClass()
	{
		messages.put(1L,new keyValueModelClass(1, "Pratik"));
		messages.put(2l, new keyValueModelClass(2, "Sagar"));
	}
	
	public List<keyValueModelClass> getAllMessages() {
		return new ArrayList<keyValueModelClass>(messages.values()); 
	}
	
	public keyValueModelClass getItem(long id) {
		return messages.get(id);
	}
	
	public keyValueModelClass addMessage(keyValueModelClass message) {
		message.setKey(messages.size() + 1);
		messages.put( message.getKey(), message);
		return message;
	}
	
	public keyValueModelClass updateMessage(keyValueModelClass message) {
		if (message.getKey() <= 0) {
			return null;
		}
		messages.put( message.getKey(), message);
		return message;
	}
	
	public keyValueModelClass removeMessage(long id) {
		return messages.remove(id);
	}
}
