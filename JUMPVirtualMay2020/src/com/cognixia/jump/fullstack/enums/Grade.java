package com.cognixia.jump.fullstack.enums;

public enum Grade {
	FRESHMAN,SOPHMORE,JUNIOR,SENIOR;
	
	Grade(){
		System.out.println(this.toString()+" is year "+(this.ordinal()+1));
	}
	
	public void hello() {
		System.out.println("This student is a "+this.toString());
	}
}
