package uk.co.bookings.hotel;

import java.util.Date;

import uk.co.bookings.clientele.Guest;

public class Room {
	
	public int getNumber() {
		return 0;
	}
	
	public int getFloor() {
		return 0;
	}

	public void book(Date from, Date to, Guest guest) {
		guest.getLastName();
	}
	
	public boolean isAvailable(Date from, Date to) {
		return false;
	}
}