package model;

public class Customer {
	private int counter = 1000;
	private int ID;
	private String name;
	private String address;
	private String email;
	private String phoneNumber;
	private boolean rating;

	/**
	 * 
	 */
	public Customer() {
		this.ID = counter++;
	}

	public Customer(String name, String address, String email, String phoneNumber, boolean rating) {
		this.ID = counter++;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.rating = rating;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isRating() {
		return rating;
	}

	public void setRating(boolean rating) {
		this.rating = rating;
	}

}
