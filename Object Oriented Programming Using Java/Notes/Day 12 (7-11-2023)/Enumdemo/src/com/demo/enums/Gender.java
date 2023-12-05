package com.demo.enums;

public enum Gender {
	Male("Male"), Female("Female");

	String gender;

	private Gender(String gender) {
		this.gender = gender;
	}

	public String display() {
		return gender;
	}
}
