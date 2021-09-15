package a1;

import java.util.Scanner;

public class Features {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 0 for Int-To-String ");
		int i = in.nextInt();
		if (i == 0){
				
			System.out.print("Welcome to Int-To-String. Please enter any value from 0 to 2: ");
			int j = in.nextInt();
			if (j == 0) {
				System.out.println("John");
			}
			
			else if (j == 1) {
				System.out.println("Ron");
			}
			
			else if (j == 2) {
				System.out.println("Joe");
			}
			
			else {
				System.out.println("Invalid");
			}
			
			
		} else {
			System.out.println("Program Terminated.");
		}
		
		in.close();

	}

}
