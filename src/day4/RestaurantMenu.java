package day4;

import java.util.Scanner;

public class RestaurantMenu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter items");
		String item=sc.nextLine();
		System.out.println("Enter Price");
		double price=sc.nextDouble();
		
		String dash = "-------------------------|------------------------";
		String dash1 = "--------------------------------------------------";
		System.out.println(String.format("|%-51s|", dash1));
		System.out.println(String.format("|%30s", "Restaurant Bill")+String.format("%21s|", ""));
		
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(String.format("|%-25s", "Items") + String.format("%-25.25s|", "Price"));
		
		
	}

}
