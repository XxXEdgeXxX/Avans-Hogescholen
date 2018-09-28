public class CoffeeMachine{
	int	amountOfCoffee = 10;
	int	amountOfChocolate = 10;
	int amountOfTea = 10;

	String Make;
	void makeDrink()
	{
		switch(Make) {
		case "Coffee":
			System.out.println("Here you have a cup of coffee");
			break;
		case "Hot Chocolate": 
			System.out.println("Here you have a cup of Hot Chocolate");
			break;
		case "Tea": 
			System.out.println("Here you have a cup of Tea");
			break;

		}



		System.out.println("Here you have a cup of coffee");
		amountOfCoffee = amountOfCoffee--;
	}

	void StockCheck(String Drink)
	{
		switch(Drink)		
		{
		case "Coffee":
			amountOfCoffee--;
			break;
		case "Hot Chocolate":
			amountOfChocolate--;
			break;
		case "Tea":
			amountOfTea--;
			break;
		}

	}



	void restock(){
		amountOfCoffee = 10;
		amountOfChocolate = 10;
	}


}