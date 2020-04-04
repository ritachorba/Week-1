import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		double coffeeSinglePrice = 7.99;
		double coffeePackPrice = 29.99;
		double moneyWalletPayday = 100.52;
		double moneyWalletEnd = 22.75;
		int numberFriendsFacebook = 380;
		int numberFriendsClass =9;
		int ageYearsRita = 37;
		int ageYearsDave = 45;
		String firstNameFemale = "Rita";
		String firstNameMale = "Dave";
		String lastNameFemale = "Mengerink";
		String lastNameMale = "Chorba";
		char middleInitialFemale = 'S';
		char middleInitialMale = 'J';
		
		//operations
		double newWalletBalance = moneyWalletPayday - coffeeSinglePrice;
		int aveFriendsYear = numberFriendsFacebook / ageYearsRita;
		String fullNameFemale = firstNameFemale + " " + middleInitialFemale + '.' + " " + lastNameFemale;
		
		//print out
		System.out.println("One bag of coffee costs" + " " + '$' + coffeeSinglePrice + '.');
		System.out.println("A value pack of coffee costs" + " " + '$' + coffeePackPrice + '.');
		System.out.println("The amount of money I have in my wallet after payday is" + " " + '$' + moneyWalletPayday + '.');
		System.out.println("The amount of money I have in my wallet before payday is" + " " + '$' + moneyWalletEnd + '.');
		System.out.println("The number of friends I have on Facebook is" + " " + numberFriendsFacebook + '.');
		System.out.println("The number of friends I have in class is" + " " + numberFriendsClass + '.');
		System.out.println("Rita's age in years is" + " " + ageYearsRita + '.');
		System.out.println("Dave's age in years is" + " " + ageYearsDave + '.');
		System.out.println("Her first name is" + " " + firstNameFemale + '.');
		System.out.println("His first name is" + " " + firstNameMale + '.');
		System.out.println("Her last name is" + " " + lastNameFemale + '.');
		System.out.println("His last name is" + " " + lastNameMale + '.');
		System.out.println("Her middle initial is" + " " + middleInitialFemale + '.');
		System.out.println("His middle initial is" + " " + middleInitialMale + '.');
		System.out.println("I have" + " " + '$' + newWalletBalance + " " + "left in my wallet after buying coffee.");
		System.out.println("I make an average of" +" " + aveFriendsYear + " " + "friends every year.");
		System.out.println("My full name is" + " " + fullNameFemale + '.');
		
		
		
		
	
		
				
		
		
		
		
		
	
		
		
			
		
		
		
	}

}
