package com.qa.AccountNumGenerator.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.qa.domain.AccountNumber;
import com.qa.service.AccountNumberGen;
import com.qa.service.LetterGen;
import com.qa.service.SixDigitNumberGen;

public class GenServiceTest {
	
	private static final String exampleLetter = "A";
	private static final String exampleNumber = "123456";
	private static final int letterNum =0;
	private LetterGen lg;
	private AccountNumber accNum;
	
	@InjectMocks
	private AccountNumberGen numgen;
	
	@Mock
	private SixDigitNumberGen sixDigit;

	@Before
	public void init() {
		lg= mock(LetterGen.class);
		sixDigit = mock(SixDigitNumberGen.class);
	}

	@Test
	public void generateAccountNumberTest() {
		when(lg.generateLetter()).thenReturn(exampleLetter);
		when(sixDigit.generateNumber()).thenReturn(exampleNumber);
		accNum = new AccountNumber(lg.generateLetter() + sixDigit.generateNumber());
		String expected=exampleLetter+exampleNumber;
		assertEquals(expected,accNum.getAccountNumber());
	}
	
	@Test
	public void getLetterTest() {
		
		when(lg.getLetter(letterNum)).thenReturn(exampleLetter);				
		assertEquals(exampleLetter, lg.getLetter(letterNum));
	}
	


}
