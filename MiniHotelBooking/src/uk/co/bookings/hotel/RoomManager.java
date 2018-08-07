package uk.co.bookings.hotel;

import java.util.Collection;
import java.util.Date;

public class RoomManager {

	public static Collection<Room> getAvailableRooms(Date from, Date to) {
		Room room = new Room();
		room.isAvailable(from, to);
		return null;
	}
	
	public static Double getAverageOccupancy(Date from, Date to) {
		return null;
	}
}