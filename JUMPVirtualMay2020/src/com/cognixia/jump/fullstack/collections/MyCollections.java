package com.cognixia.jump.fullstack.collections;

import java.util.ArrayList;
import java.util.List;

public class MyCollections {

	public static void main(String[] args) {
		
		//List
		createList();

	}

	private static void createList() {
		List<Integer> myList = new ArrayList<>();
		//create
		myList.add(5);
		//read
		myList.get(0);
		//update
		myList.set(0, 32);
		//delete
		myList.remove(0);
		//other
		myList.clear();
		
	}

}
