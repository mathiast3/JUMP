package com.cognixia.jump.fullstack.enums;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EnumRunner {
	
	// Enums can be declared within classes, and have their own access
	// modifiers
	private enum Days{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	public static void main(String[] args) {
		
		daysRunner();
		gradeRunner();
		//cakeRunner();
		//Date date = new SimpleDateFormat("MM/dd/yy").parse("")
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YY");
		sdf.format(date);
		System.out.println(date);
	}
	
	public static void daysRunner() {
		System.out.println(Days.FRIDAY);
	}
	
	public static void gradeRunner() {
		Grade grade = Grade.SENIOR;
		
		System.out.println(grade.ordinal());
		
		// print info bound to the enums value
		System.out.println(grade.name());
		
		// Each of the enums have access to the hello method
		grade.hello();
		
		// switch with enums
		switch (grade) {
		case FRESHMAN:
			System.out.println("First year in high school");
			break;
		case SOPHMORE:
			System.out.println("Second year in high school");
			break;
		case JUNIOR:
			System.out.println("Third year in high school");
			break;
		case SENIOR:
			System.out.println("Fourth year in high school");
			break;
		default:
			System.out.println("Not a valid grade level");
			break;
		}
	}
}