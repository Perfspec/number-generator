package com.qa.service;

import java.util.Random;

import com.qa.constants.Constants;

public class SixDigitNumberGen {

	public String generateNumber() {
		Random rand = new Random();
		Integer num = rand.nextInt(Constants.SIX_DIGIT_UPPER_LIMIT) + Constants.SIX_DIGIT_LOWER_LIMIT;

		return num.toString();
	}

}
