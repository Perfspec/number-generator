package com.qa.AccountNumGenerator.rest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.rest.AccountEndpoint;
import com.qa.service.AccountNumberGen;

@RunWith(MockitoJUnitRunner.class)
public class GenControllerTest {
	
	private static final String exampleAccount = "A123223";
		
	@InjectMocks
	private AccountEndpoint end;
	
	@Mock
	private AccountNumberGen service;
	
	@Before
	public void setup() {
		end.setService(service);
	}

	@Test
	public void testCreate6Digit() {
		Mockito.when(end.createAccount(0)).thenReturn(exampleAccount);
		
		assertEquals(exampleAccount, end.createAccount(0));
	}

}
