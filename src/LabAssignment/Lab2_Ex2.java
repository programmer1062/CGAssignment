package LabAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_Ex2 {
	public static void sortStrings(String[] str, int n) {
		Arrays.sort(str);
		if (str.length % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				System.out.print(str[i].toUpperCase() + " ");
			}
			for (int i = n / 2; i < n; i++) {
				System.out.print(str[i].toLowerCase() + " ");
			}
		} else {
			for (int i = 0; i < (n / 2) + 1; i++) {
				System.out.print(str[i].toUpperCase() + " ");
			}
			for (int i = (n / 2) + 1; i < n; i++) {
				System.out.print(str[i].toLowerCase() + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		sortStrings(str, n);
	}

}
