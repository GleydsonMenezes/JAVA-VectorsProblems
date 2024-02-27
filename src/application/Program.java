package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.Product;
import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of exercícies do you'll see: \n"
				+ "1 - Products Vectors\n"
				+ "2 - Negative numbers Vectors\n"
				+ "3 - Average values Vectors\n"
				+ "4 - Height values Vectors\n"
				+ "5 - Even Numbers Vectors\n"
				+ "6 - Higher Value position Vectors\n"
				+ "7 - Sum of Vectors \n"
				+ "8 - Under Average\n"
				+ "9 - Average between Even numbers\n"
				+ "10 - boarding house Challenge\n"
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
		case 3:
			System.out.println("How many numbers will you enter? ");
			n = sc.nextInt();
			sc.nextLine();
			int[] vect1 = new int[n];
			
			for (int i = 0; i < vect1.length; i++) {
				System.out.println("Enter a number: ");
				vect1[i] = sc.nextInt();				
			}
			
			int sum1 = 0;
			System.out.print("VALUES: ");
			for (int i = 0; i < vect1.length; i++) {
				System.out.print(" " + vect1[i]);
				sum1 += vect1[i];
			}
			System.out.print("\nSUM: "+ sum1);
			System.out.print("\nAVERAGE: "+ sum1 / vect1.length);

			break;
			
		case 4:
			
			System.out.println("How many people will you enter? ");
			n = sc.nextInt();
			sc.nextLine();
			Person[] person = new Person[n];
			
			double avgHeight = 0.0;
			double percentMinor = 0.0;
			for (int i = 0; i < person.length; i++) {
				System.out.print("Data of #"+ (i + 1) +" person: \n");
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("Height: ");
				double height = sc.nextDouble();	
				sc.nextLine();
				person[i] = new Person(name, age, height);
				avgHeight += person[i].getHeight();
				if (person[i].getAge() < 16) {
					percentMinor++;
				}
			}
			
			System.out.printf("AVERAGE HEGHT: %.2f\n", (double)(avgHeight / person.length));
			percentMinor = ((double)percentMinor / person.length) * 100.0;
			System.out.printf("People under 16: %.1f%\n", percentMinor);
			for (int i = 0; i < person.length; i++) {
				if (person[i].getAge() < 16) {
					System.out.println(person[i].getName());
				}
			}
			
			
			break;
			
		case 5:
			
			int evenNumbersQuantity = 0;
			System.out.println("How many numbers will you enter? ");
			n = sc.nextInt();
			sc.nextLine();
			int[] vect2 = new int[n];
			
			for (int i = 0; i < vect2.length; i++) {
				System.out.println("Enter a number: ");
				vect2[i] = sc.nextInt();	
			}
			
			System.out.println("EVEN NUMBERS: ");
			for (int i = 0; i < vect2.length; i++) {
				if (vect2[i] %2 == 0) {
					System.out.println(" " + vect2[i]);
					evenNumbersQuantity++;
				}
	
			}
			System.out.println("NUMBER OF EVEN = "+ evenNumbersQuantity);
			
			break;
			
		case 6:
			
			int highValue = 0;
			int highPosition = 0;
			System.out.println("How many numbers will you enter? ");
			n = sc.nextInt();
			sc.nextLine();
			int[] vect3 = new int[n];
			
			for (int i = 0; i < vect3.length; i++) {
				System.out.println("Enter a number: ");
				vect3[i] = sc.nextInt();	
				if (vect3[i] > highValue) {
					highValue = vect3[i];
					highPosition = i;
				}			
			}
			
			System.out.println("HIGHER VALUE: " + highValue);
			System.out.println("POSITION OF THE HIGHER VALUE: "+ highPosition);
			
			break;
			
		case 7:
			
			System.out.println("How many values will each vector have? ");
			n = sc.nextInt();
			sc.nextLine();
			int[] vectA = new int[n];
			int[] vectB = new int[n];
			int[] vectResult = new int[n];
			
			for (int i = 0; i < vectA.length; i++) {
				System.out.println("Enter the values of vector A: ");
				vectA[i] = sc.nextInt();	
				vectResult[i] += vectA[i];
				
			}
			
			for (int i = 0; i < vectB.length; i++) {
				System.out.println("Enter the values of vector B: ");
				vectB[i] = sc.nextInt();
				vectResult[i] += vectB[i];
			}
				
			System.out.println("VECTOR RESULT: ");
			for (int i = 0; i< vectResult.length; i++) {
				System.out.println(vectResult[i]);
			}
			
			break;
		
		case 8:
			
			double avgVector = 0.0;
			double underAvg = 0.0;
			System.out.println("How many values will each vector have? ");
			n = sc.nextInt();
			sc.nextLine();
			double[] vect4 = new double[n];
			
			
			for (int i = 0; i < vect4.length; i++) {
				System.out.println("Enter a number: ");
				vect4[i] = sc.nextDouble();	
				avgVector += vect4[i];
			}
			
			avgVector = avgVector / vect4.length;
			System.out.printf("Average Vector: %.3f%n", avgVector);
			for (int i = 0; i < vect4.length; i++) {
				if (vect4[i] < avgVector) {
					System.out.println(vect4[i]);
				}
			}
		case 9:
			
			
			System.out.println("How many values will each vector have? ");
			int EvenNumbersCount = 0;
			int EvenNumbersavg = 0;
			n = sc.nextInt();
			sc.nextLine();
			int[] vect5 = new int[n];
			
			
			for (int i = 0; i < vect5.length; i++) {
				System.out.println("Enter a number: ");
				vect5[i] = sc.nextInt();
				sc.nextLine();
			}
			
			for (int i = 0; i < vect5.length; i++) {
				if (vect5[i] % 2 == 0) {
					EvenNumbersavg += vect5[i];
					EvenNumbersCount++;
				} 
			}
			
			if (EvenNumbersCount > 0) {
				System.out.printf("AVERAGE OF EVEN NUMBERS: %.1f", (double)(EvenNumbersavg/EvenNumbersCount));
			}else {
				System.out.println("No Even Numbers");
			}
			
			break;
			
		case 10:
			
			
			System.out.println("How many rooms will be rented?");
			n = sc.nextInt();
			sc.nextLine();
			Rent[] Rent = new Rent[10];
			for (int i = 1; i <= n; i++) {
				System.out.println("Rent #" + i+ ": ");
				System.out.print("name: ");
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("Number of room: ");
				int roomNumber = sc.nextInt();
				sc.nextLine();
				Rent[roomNumber] = new Rent(name, email);
			}
			
			for (int i = 0; i < Rent.length; i++) {
				if (Rent[i] != null) {
					System.out.println("Busy rooms: ");
					System.out.println((i)+ ": "+ Rent[i]);
				}
			}
			
			
			break;
			
		}
		sc.close();
	}

}
