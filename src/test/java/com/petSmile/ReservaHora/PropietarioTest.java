package com.petSmile.ReservaHora;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PropietarioTest {
	
	public PropietarioTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void teraDown() {
	}
	
	@Test
	public void testPropietario() {
		System.out.println("Propietario");
		try {
			
			Propietario instance = new Propietario("");	
			
			} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}

}
