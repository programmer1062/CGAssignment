package LabAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_Ex3 {
	public static void getSorted(int[] arr) {
		int n=arr.length;
		int[] newArray=new int[n];
		for(int i=0;i<arr.length;i++) {
			StringBuffer sb=new StringBuffer();
			sb.append(arr[i]);
			sb.reverse();
			int x=Integer.parseInt(sb.toString());
			newArray[i]=x;
		}
		for(int a:newArray) {
			System.out.print(a+" ");
		}
		System.out.println("");
		Arrays.sort(newArray);
		for(int a:newArray) {
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		getSorted(arr);
	}

}
