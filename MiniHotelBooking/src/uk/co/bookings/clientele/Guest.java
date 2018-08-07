package uk.co.bookings.clientele;

import java.util.UUID;

public class Guest {
	
	private Guest() {
		
	}

	public UUID getID() {
		return null;
	}
	
	public String getFirstName() {
		return null;
	}
	
	public String getLastName() {
		return null;
	}
	
	public static Guest register(String firstName, String lastName) {
		return new Guest();
	}
	
	public static Guest get(UUID id) {
		return null;
	}
}