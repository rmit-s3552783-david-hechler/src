package model;

public class Movie {
	private static int counter = 1000;
	private int ID;
	private String title;
	private Category category;
	private double rentalCharge;
	private int rentalPeriod; // days allowed
	private int releaseDate; // year of release
	private double overDueCharge; // per day

	public Movie(String title, Category category, double rentalCharge, int rentalPeriod, int releaseDate,
			double overDueCharge) {
		this.title = title;
		this.category = category;
		this.rentalCharge = rentalCharge;
		this.rentalPeriod = rentalPeriod;
		this.releaseDate = releaseDate;
		this.overDueCharge = overDueCharge;
	}

	public static synchronized int getCounter() {
		return counter;
	}

	public static synchronized void setCounter(int counter) {
		Movie.counter = counter;
	}

	public synchronized int getID() {
		return ID;
	}

	public synchronized void setID(int iD) {
		ID = iD;
	}

	public synchronized String getTitle() {
		return title;
	}

	public synchronized void setTitle(String title) {
		this.title = title;
	}

	public synchronized Category getCategory() {
		return category;
	}

	public synchronized void setCategory(Category category) {
		this.category = category;
	}

	public synchronized double getRentalCharge() {
		return rentalCharge;
	}

	public synchronized void setRentalCharge(double rentalCharge) {
		this.rentalCharge = rentalCharge;
	}

	public synchronized int getRentalPeriod() {
		return rentalPeriod;
	}

	public synchronized void setRentalPeriod(int rentalPeriod) {
		this.rentalPeriod = rentalPeriod;
	}

	public synchronized int getReleaseDate() {
		return releaseDate;
	}

	public synchronized void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public synchronized double getOverDueCharge() {
		return overDueCharge;
	}

	public synchronized void setOverDueCharge(double overDueCharge) {
		this.overDueCharge = overDueCharge;
	}

	public Movie() {
		this.ID = counter++;

	}

}
