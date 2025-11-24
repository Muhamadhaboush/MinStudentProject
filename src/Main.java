
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		ArrayList<Student> studentts = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("How many students do you want to add?");

			int count = scanner.nextInt();

			scanner.nextLine();
			for (int i = 0; i < count; i++) {

				System.out.println("Enter student name: ");

				String name = scanner.nextLine();

				System.out.println("Enter student age: ");

				int age = scanner.nextInt();

				scanner.nextLine();

				studentts.add(new Student(name, age));
			}

			System.out.println("\n--- Student List----");
			for (Student s : studentts) {
				System.out.println(s);
			}

		} catch (Exception e) {
			System.out.println("Error: Invalid input! try again. ");
		} finally {
			scanner.close();
		}

	}

}
