package com.epam.engx.cleancode.naming.task2;

import java.util.Arrays;
import java.util.Date;

public class User {

	private Date dBirth;

	private String sName;

	private boolean bAdmin;

	private User[] subordinateArray;

	private int iR;

	public User(String sName) {
		super();
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "User [dBirth=" + dBirth + ", sName=" + sName + ", bAdmin=" + bAdmin + ", subordinateArray="
				+ Arrays.toString(subordinateArray) + ", iRating=" + iR + "]";
	}

}
