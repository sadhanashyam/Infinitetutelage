package demoprojects;
import java.util.Scanner;
public class userinput {
	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		String firstNumber;
		
		System.out.println("Enter the name");
		firstNumber= object.nextLine();
		System.out.println("the string is:"+firstNumber);
	}
	

}
