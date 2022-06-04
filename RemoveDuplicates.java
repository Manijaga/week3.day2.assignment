package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		// a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";

		// b) Initialize an integer variable as count

		// c) Split the String into array and iterate over it
		String[] split = text.split(" ");
		Set<String> unique = new LinkedHashSet<String>();

		// d) Initialize another loop to check whether the word is there in the array
		// e) if it is available then
		// ) Displaying the String without duplicate words

		for (int i = 0; i < split.length; i++) {

			if (unique.add(split[i])) {
				System.out.println(split[i]);

			}
		}

	}
}