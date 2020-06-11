package com.cognixia.jump.fullstack.classesAndObjects;

import java.util.HashMap;
import java.util.Map;

public class IsArrayEqual {

	public IsArrayEqual() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one = {7,7,9,10,5,5,5,56,4,28,5,77,1090092929,4};
		int[] two = {7,4,7,10,9,28,4,56,5,5,5,5,77,1090092929};
		System.out.println(isEqual(one,two));
	}
	
	private static boolean isEqual(int[] arr,int[] arr2) {
		Map<Integer,Integer> map = new HashMap<>();
 		for(int num:arr) {
			map.put(num,map.getOrDefault(num, 0)+1);
			System.out.println(map.get(num));
		}
 		
 		for(int num:arr2) {
 			if(!map.containsKey(num)) {
 				return false;
 			}else {
 				if(map.get(num)>1) map.put(num,map.get(num)-1);
 				else map.remove(num);
 			}
 		}
 		if(!map.isEmpty())return false;
 		return true;
 		
	}

}
