package com.cognixia.jump.fullstack.classesAndObjects;

public class Animal implements Kingdom {

	String respiration;
	
	
	public Animal(String respiration) {
		this.respiration = respiration;
	}

	@Override
	public String getResp() {
		// TODO Auto-generated method stub
		return respiration;
	}

	@Override
	public void setResp(String resp) {
		// TODO Auto-generated method stub
		respiration = resp;
	}
	
}
