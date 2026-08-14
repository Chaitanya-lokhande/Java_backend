package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String, Integer> structure;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	

	public Map<String, Integer> getStructure() {
		return structure;
	}

	public void setStructure(Map<String, Integer> structure) {
		this.structure = structure;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", structure=" + structure + "]";
	}

	
}
