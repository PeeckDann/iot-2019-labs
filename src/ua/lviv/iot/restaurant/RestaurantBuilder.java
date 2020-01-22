package ua.lviv.iot.restaurant;

public class RestaurantBuilder {

	public static void main(String[] args) {
		Restaurant firstRestaurant = new Restaurant("CLaude Monet", 100, "Bandery st. 17", 30, 50.50, 1250.40, "French",
				1);
		Restaurant secondRestaurant = new Restaurant("Arcobaleno", 120, "Petlury st. 28", 40);
		Restaurant thirdRestaurant = new Restaurant();

		System.out.println("----------------------First Restaurant----------------------------------");
		System.out.println(firstRestaurant.toString());
		System.out.println("----------------------Second Restaurant---------------------------------");
		System.out.println(secondRestaurant.toString());
		System.out.println("----------------------Third Restaurant----------------------------------");
		System.out.println(thirdRestaurant.toString());

		System.out.println("----------------------Profitability-------------------------------------");
		Restaurant.printStaticProfitability();
		firstRestaurant.printProfitability();

		Restaurant arrayOfRestaurants[] = new Restaurant[4];

		for (int i = 0; i <= 3; ++i) {
			Restaurant elementOfArray = new Restaurant("CLaude Monet", 100 + 5 * i, "Bandery st. 17", 30 + 2 * i,
					50.50, 1250.40, "French", 1 + i);
			arrayOfRestaurants[i] = elementOfArray;
		}

		for (Restaurant itRestaurant : arrayOfRestaurants) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println(itRestaurant.toString());
		}
	}

}