package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of exercícies do you'll see: \n"
				+ "1 - Products Vectors\n"
				+ "2 - Negative numbers Vectors\n"
				+ "0 - Exit");
		int number = sc.nextInt();
		sc.nextLine();
		
		switch(number) {
			
		case 1:
			System.out.println("Number of products to register: ");
			int n = sc.nextInt();
			Product[] vector = new Product[n];
			
			for (int i = 0; i < n; i++) {
				sc.nextLine();
				System.out.println("Product Name: ");
				String name = sc.nextLine();	
				System.out.println("Product Price: ");
				double price = sc.nextDouble();
					vector[i] = new Product(name, price);
				}
			
			double sum = 0.0;
			for (int i=0; i<n; i++) {
				sum += vector[i].getPrice();
			}
			double avg = sum / n;
			System.out.printf("AVERAGE PRICE = %.2f%n", avg);
				
				break;		
		case 2:
			
			
			System.out.println("How many numbers will you enter? ");
			n = sc.nextInt();
			sc.nextLine();
			int[] vect = new int[n];
			
			for (int i = 0; i < vect.length; i++) {
				System.out.println("Enter a number: ");
				vect[i] = sc.nextInt();
			}
			System.out.println("NEGATIVE NUMBERS: ");
			for (int i = 0; i < vect.length; i++) {
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
			
			
			break;
			
		}
		sc.close();
	}

}
