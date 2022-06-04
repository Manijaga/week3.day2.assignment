package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		String input = "babu";
		// Convert String to character Array
		char[] convertStringToArray = input.toCharArray();
		// crate a set
		Set<Character> unique = new LinkedHashSet<Character>();

		// Add each character to set and if it is already there and remove
		for (int i = 0; i < convertStringToArray.length; i++) {
			if (unique.add(convertStringToArray[i]) == false)

			{
				unique.remove(convertStringToArray[i]);

			}
		}
		System.out.println(unique);

	}

}
