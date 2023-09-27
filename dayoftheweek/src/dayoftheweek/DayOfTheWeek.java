/**
 * 
 */
package dayoftheweek;
import java.util.Scanner;

/**
 * 
 */
public class DayOfTheWeek {

	/**
	 * 
	 */
	public static void DayOfTheWeek() {
		try(Scanner input = new Scanner(System.in)){
			String userInput;
			System.out.println("What is your favorite day of the week?");
			if(input.hasNextLine()) {
				userInput=input.nextLine();
				System.out.println("Your favorite day of the week is " + userInput);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfTheWeek.DayOfTheWeek();
	}

}
