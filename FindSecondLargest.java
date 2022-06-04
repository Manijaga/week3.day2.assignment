package week3.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };

		// Arrange the array in ascending order
		Arrays.sort(data);

		// 2) Pick the 2nd element and print
		System.out.println("The second Largest number is on array list is - " + data[((data.length) - 2)]);

	}

}
