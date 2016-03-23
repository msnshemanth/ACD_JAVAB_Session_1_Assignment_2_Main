import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter you age :");
		int age = scan.nextInt();
		if((age >= 18)&&(age<=100))
		{
			System.out.println("You are eligible to vote");
		}
		else{
			System.out.println("You are not eligible to vote");
		}
	}

}