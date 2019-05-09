package com.keyvalue.kvimplementation;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class keyValueModelClass {
	
	private long key;
	private String value;
	
	public keyValueModelClass()
	{
		
	}
    public keyValueModelClass(long key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	public long getKey() {
		return key;
	}
	public void setKey(long key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	

}
