package uk.co.bookings.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.co.bookings.hotel.Room;

public class RoomTest {
	
	private Room room = new Room();

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
	public void testBook1() {
		room.book(null, null, null);
	}
	
	@Test
	public void testBook2() {
		room.book(null, null, null);
	}

	@Test
	public void testBook3() {
		room.book(null, null, null);
	}
	
	@Test
	public void testIsAvailable1() {
		room.isAvailable(null, null);
	}
	
	@Test
	public void testIsAvailable2() {
		room.isAvailable(null, null);
	}
}
