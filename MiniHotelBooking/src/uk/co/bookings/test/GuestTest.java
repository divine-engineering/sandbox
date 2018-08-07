package uk.co.bookings.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.co.bookings.clientele.Guest;

public class GuestTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void registerTest1() {
		Guest.register(null, null);
	}

	@Test
	public void registerTest2() {
		Guest.register(null, null);
	}
}