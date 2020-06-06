package io.workshop.domain;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		if (day > 0 && day <= 31 ) { // logic
			this.day = day;
		}
	}
	
	public void setMonth(int month) {
		// write logic
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
