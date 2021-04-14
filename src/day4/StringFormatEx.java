package day4;

import java.util.Scanner;

public class StringFormatEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstNameValue=sc.nextLine();
		System.out.println("Enter Last Name");
		String lastNameValue=sc.nextLine();
		System.out.println("Enter DOB");
		String dobValue=sc.nextLine();
		System.out.println("Enter Mobile");
		String mobileValue=sc.nextLine();
		System.out.println("Enter Email");
		String emailValue=sc.nextLine();
		System.out.println("Enter Company");
		String companyValue=sc.nextLine();
		System.out.println("Enter Post");
		String postValue=sc.nextLine();
		
		String dash = "-------------------------|------------------------";
		String dash1 = "--------------------------------------------------";
		System.out.println(String.format("|%-51s|", dash1));
		System.out.println(String.format("|%30s", "Emp Details")+String.format("%21s|", ""));
		
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(String.format("|%-25s|", "First Name") + String.format("%-25.25s|", firstNameValue));
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(String.format("|%-25s|", "Last Name") + String.format("%-25.25s|", lastNameValue));
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(String.format("|%-25s|", "Dob") + String.format("%-25.25s|", dobValue));
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(String.format("|%-25s|", "Mobile") + String.format("%-25.25s|", mobileValue));
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(String.format("|%-25s|", "Email") + String.format("%-25.25s|", emailValue));
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(String.format("|%-25s|", "Company") + String.format("%-25.25s|", companyValue));
		System.out.println(String.format("|%-51s|", dash));
		System.out.println(String.format("|%-25s|", "Post") + String.format("%-25.25s|", postValue));
		System.out.println(String.format("|%-51s|", dash));
	}

}
