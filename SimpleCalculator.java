import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args) {
		// int x=10;
		// int y=10;
			Scanner ab = new Scanner (System.in);
		System.out.print("Enter the First number: ");
		int first = ab.nextint();
		System.out.print("Enter the Second Number: ");
		int second = ab.nextint();
			Scanner sc = new Scanner (System.in);
		System.out.print("What you want to do: ");
		String operator = sc.nextLine();


		if (operator.equals("+")){
			System.out.println(first + second);
		}else if(operator.equals("-") ){
			System.out.println(first - second);
		}else if (operator.equals("*")){
			System.out.println(first * second);
		}else if (operator.equals("/")) {
			System.out.println(first / second);
		}
		else{
			System.out.println("Wrong");
		}
	}
}