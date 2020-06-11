package com.cognixia.jump.fullstack.classesAndObjects;

public class FizzBuzz {
	private int size;
	public FizzBuzz(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void buzz() {
		boolean fizz = false;
		for(int i = 1;i<size;i++) {
			fizz=false;
			if(i%3==0) {
				System.out.print("Fizz");
				fizz=true;
			}
			if(i%5==0) {
				fizz=true;
				System.out.print("Buzz");
			}
			if(!fizz) System.out.println(i);
			else System.out.println();
			
		}
	}

}
