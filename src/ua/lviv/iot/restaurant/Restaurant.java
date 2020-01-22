package ua.lviv.iot.restaurant;

public class Restaurant {
	private static int profitability = 15;

	private String name;
	private int numberOfDishesOnTheMenu;
	private String address;
	private int numberOfTables;
	private double bookingPriceInDollars;
	private double bookingPriceInGryvnias;

	protected String cuisine;
	protected int numberOfHalls;

	public Restaurant() {
		this(null, 0, null, 0);
	}

	public Restaurant(String name, int numberOfDishesOnTheMenu, String address, int numberOfTables) {
		this(name, numberOfDishesOnTheMenu, address, numberOfTables, 0.0, 0.0, null, 0);
	}

	public Restaurant(String name, int numberOfDishesOnTheMenu, String address, int numberOfTables,
			double bookingPriceInDollars, double bookingPriceInGryvnias, String cuisine, int numberOfHalls) {
		this.name = name;
		this.numberOfDishesOnTheMenu = numberOfDishesOnTheMenu;
		this.address = address;
		this.numberOfTables = numberOfTables;
		this.bookingPriceInDollars = bookingPriceInDollars;
		this.bookingPriceInGryvnias = bookingPriceInGryvnias;
		this.cuisine = cuisine;
		this.numberOfHalls = numberOfHalls;
	}

	public static int getProfitability() {
		return profitability;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfDishesOnTheMenu() {
		return numberOfDishesOnTheMenu;
	}

	public String getAddress() {
		return address;
	}

	public int getNumberOfTables() {
		return numberOfTables;
	}

	public double getBookingPriceInDollars() {
		return bookingPriceInDollars;
	}

	public double getBookingPriceInGryvnias() {
		return bookingPriceInGryvnias;
	}

	public String getCuisine() {
		return cuisine;
	}

	public int getNumberOfHalls() {
		return numberOfHalls;
	}

	public static void setProfitability(int profitability) {
		Restaurant.profitability = profitability;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfDishesOnTheMenu(int numberOfDishesOnTheMenu) {
		this.numberOfDishesOnTheMenu = numberOfDishesOnTheMenu;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setNumberOfTables(int numberOfTables) {
		this.numberOfTables = numberOfTables;
	}

	public void setBookingPriceInDollars(double bookingPriceInDollars) {
		this.bookingPriceInDollars = bookingPriceInDollars;
	}

	public void setBookingPriceInGryvnias(double bookingPriceInGryvnias) {
		this.bookingPriceInGryvnias = bookingPriceInGryvnias;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public void setNumberOfHalls(int numberOfHalls) {
		this.numberOfHalls = numberOfHalls;
	}

	public void resetValues(String name, int numberOfDishesOnTheMenu, String address, int numberOfTables,
			double bookingPriceInDollars, double bookingPriceInGryvnias, String cuisine, int numberOfHalls) {
		this.name = name;
		this.numberOfDishesOnTheMenu = numberOfDishesOnTheMenu;
		this.address = address;
		this.numberOfTables = numberOfTables;
		this.bookingPriceInDollars = bookingPriceInDollars;
		this.bookingPriceInGryvnias = bookingPriceInGryvnias;
		this.cuisine = cuisine;
		this.numberOfHalls = numberOfHalls;
	}

	public String toString() {
		return "Name: " + name + "; Number of dishes: " + numberOfDishesOnTheMenu + "; Address: " + address
				+ ";\n Number of tables: " + numberOfTables + "; Booking price in dollars: " + bookingPriceInDollars
				+ ";\n Booking price in gryvnias: " + bookingPriceInGryvnias + "; Cuisine: " + cuisine
				+ "; Number of halls: " + numberOfHalls + ".";
	}

	static void printStaticProfitability() {
		System.out.println("Profitability: " + profitability + "%");
	}

	void printProfitability() {
		System.out.println("Profitability: " + profitability + "%");
		;
	}

}