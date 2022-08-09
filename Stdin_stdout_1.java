
// HackerRant Prepare > Java > Introduction > Java Stdin and Stdout 1
//
// This code creates a Scanner object and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String).

import java.util.Scanner;

public class Stdin_stdout_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		scan.close();

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}