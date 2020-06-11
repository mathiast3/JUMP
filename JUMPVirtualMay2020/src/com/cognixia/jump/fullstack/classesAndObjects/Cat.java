package com.cognixia.jump.fullstack.classesAndObjects;

public class Cat extends Animal {
	String type;
	int weight;
	public Cat(String respiration, String type, int weight) {
		super(respiration);
		this.type = type;
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
