package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.InputMismatchException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BankingTests {
	
	private static final Driver driver = new Driver();
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void wrongLogin() {
		expectedException.expect(InputMismatchException.class);
		driver.

	}
	
	//@Test
	
	//@Test
	
	//@Test
	
	//@Test

}
