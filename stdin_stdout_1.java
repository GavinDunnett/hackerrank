
// HackerRant Prepare > Java > Introduction > Java Stdin and Stdout 1
//
// This code creates a Scanner object and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String).

import java.util.Scanner;

public class stdin_stdout_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int i = scan.nextInt();
		scan.close();

		System.out.println("str = " + str);
		System.out.println("i = " + i);
	}
}