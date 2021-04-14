package day4;

import java.util.Scanner;

public class MainCalc {

	public static void main(String[] args) {
		Calc c=new Calc();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter the Operation you want?");
			System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter num 1:");
				int n1=sc.nextInt();
				System.out.println("Enter num 2:");
				int n2=sc.nextInt();
				System.out.println("result of add:"+c.add(n1, n2));
				break;
			case 2:
				System.out.println("Enter num 1:");
				int n3=sc.nextInt();
				System.out.println("Enter num 2:");
				int n4=sc.nextInt();
				System.out.println("result of sub:"+c.sub(n3, n4));
				break;
			case 3:
				System.out.println("Enter num 1:");
				int n5=sc.nextInt();
				System.out.println("Enter num 2:");
				int n6=sc.nextInt();
				System.out.println("result of mul:"+c.mul(n5, n6));
				break;
			case 4:
				System.out.println("Enter num 1:");
				int n7=sc.nextInt();
				System.out.println("Enter num 2:");
				int n8=sc.nextInt();
				System.out.println("result of div:"+c.div(n7, n8));
				break;
			case 5:
				break;
			}
		}while(choice!=5);
	}

}
