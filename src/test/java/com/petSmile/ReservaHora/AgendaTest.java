package com.petSmile.ReservaHora;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AgendaTest {
	
	public AgendaTest() {
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
	public void testAgenda() {
		System.out.println("Agenda");
		try {
			
			Agenda instance = new Agenda("");	
			
			} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());
		}
	}

}
