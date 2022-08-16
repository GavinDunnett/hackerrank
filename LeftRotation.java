import java.io.*;
import java.util.*;

// This coding challenge is from HackerRank https://www.hackerrank.com
// 
// Given an array of integers and a number, performs left rotations on the array. The updated array is printed as a single line of space-separated integers.
//
// Written by Gavin Dunnett

public class LeftRotation {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
		// Write your code here
		
		// put left-shifted sequence into a secound array;
		Integer[] b = new Integer[a.size()];
		for (int i = 0; i < a.size(); i++) {
			int element = (i+d)%a.size();
			b[i] = a.get(element);
			}
			
		return Arrays.asList(b);
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		List<Integer> input = new ArrayList<>(60000);
		Scanner sc1 = new Scanner(new File("input08.txt"));
		sc1.nextInt(); 	// dump unused integer
		int d = sc1.nextInt();
		while (sc1.hasNextInt()) {
			input.add(sc1.nextInt());
		}

		List<Integer> rotInput = new ArrayList<>(rotLeft(input, d));

		List<Integer> output = new ArrayList<>(60000);
		Scanner sc2 = new Scanner(new File("output08.txt"));
		while (sc2.hasNextInt()) {
			output.add(sc2.nextInt());
		}
		
		if (rotInput.equals(output)) {
			System.out.println("PASSED");
		} else System.out.println("FAILED");
	}
}
