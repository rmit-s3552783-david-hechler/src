package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Database {
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	ArrayList<Movie> movieList = new ArrayList<Movie>();

	Category comedy;
	Category action;
	Category family;
	Category drama;

	// public Customer(String name, String address, String email, String
	// phoneNumber, boolean rating)
	Customer david = new Customer("David Hechler", "220 Spencer Street, Melbourne VIC 3000", "hechler.david@gmail.com",
			"+61 403 457 187", false);
	Customer labib = new Customer();
	Customer prajakta = new Customer();
	Customer rohan = new Customer();
	Customer sergio = new Customer();
	Customer nano = new Customer();
	Customer cristian = new Customer();
	Customer ana = new Customer();
	Customer marina = new Customer();
	Customer colin = new Customer();

	/**
	 * TODO insert Cusomers into the ArrayList
	 */
	// public Movie(String title, Category category, double rentalCharge, int
	// rentalPeriod, int releaseDate, double overDueCharge)
	/**
	 * TODO Forrest Gump needs to be in several categories:comedy,drama
	 */
	Movie forrestGump = new Movie("Forrest Gump", action, 10.00, 5, 1994, 2.00);
	
	Movie djangoUnchained = new Movie("Django Unchained", drama, 15.00, 5, 2012, 5.00);
	
	Movie lordOfTheRings1 = new Movie("Lord of the Rings: The Fellowship of the Ring", action, 10.00, 7, 2001, 2.00);
	Movie lordOfTheRings2 = new Movie("Lord of the Rings: The Two Towers", action, 10.00, 7, 2002, 2.00);
	Movie lordOfTheRings3 = new Movie("Lord of the Rings: The Return of the King", action, 10.00, 7, 2003, 2.00);
	
	Movie harryPotter1 = new Movie("Harry Potter and the Philosopher's Stone", family, 10.00, 7, 2001, 2.00);
	Movie harryPotter2 = new Movie("Harry Potter and the Chamber of Secrets", family, 10.00, 7, 2002, 2.00);
	Movie harryPotter3 = new Movie("Harry Potter and the Prisoner of Azkaban", family, 10.00, 7, 2004, 2.00);
	Movie harryPotter4 = new Movie("Harry Potter and the Goblet of Fire", family, 10.00, 7, 2005, 2.00);
	Movie harryPotter5 = new Movie("Harry Potter and the Order of the Pheonix", family, 10.00, 7, 2007, 2.00);
	Movie harryPotter6 = new Movie("Harry Potter and the Half-Blood Prince", family, 10.00, 7, 2009, 2.00);
	Movie harryPotter7_1 = new Movie("Harry Potter and the Deathly Hallows - Part 1", family, 10.00, 7, 2010, 2.00);
	Movie harryPotter7_2 = new Movie("Harry Potter and the Deathly Hallows - Part 2", family, 10.00, 7, 2011, 2.00);

	/**
	 * TODO insert movies into the ArrayList
	 */
	
	public Database() {
	}

}
