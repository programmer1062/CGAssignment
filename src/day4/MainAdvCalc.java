package day4;

import java.util.Scanner;

public class MainAdvCalc {

	public static void main(String[] args) {
		AdvanceCalc c=new AdvanceCalc();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter the Operation you want?");
			System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter number of operands:");
				int n1=sc.nextInt();
				System.out.println("Enter the operands");
				int[] arr=new int[n1];
				for(int i=0;i<n1;i++) {
					arr[i]=sc.nextInt();
				}
				System.out.println("result of add:"+c.add(arr));
				break;
			case 2:
				System.out.println("Enter number of operands:");
				int n2=sc.nextInt();
				System.out.println("Enter the operands");
				int[] arr1=new int[n2];
				for(int i=0;i<n2;i++) {
					arr1[i]=sc.nextInt();
				}
				System.out.println("result of sub:"+c.sub(arr1));
				break;
			case 3:
				System.out.println("Enter number of operands:");
				int n3=sc.nextInt();
				System.out.println("Enter the operands");
				double[] arr2=new double[n3];
				for(int i=0;i<n3;i++) {
					arr2[i]=sc.nextInt();
				}
				System.out.println("result of mul:"+c.mul(arr2));
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
