package com.cognixia.jump.fullstack;

import java.util.ArrayList;
import java.util.List;

public class PrimeCalculator {
	static List<Integer> primes;
	public PrimeCalculator(int bound){
		// Constructor
		primes = new ArrayList<>();
		checkNumbers(bound);
	}
	
	private void checkNumbers(int bound) {
		for(int i = 2;i<bound;i++) {
			if(isPrime(i)) {
				primes.add(i);
			}
		}
	}

	public boolean isPrime(int num) {
		if(num<=1)return false;
		
		for(int i = 2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
