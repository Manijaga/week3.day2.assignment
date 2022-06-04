package week3.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// a) Declare An array for {3,2,11,4,6,7};
		int[] arr = { 3, 2, 11, 4, 6, 7 };

		// b) Declare another array for {1,2,8,4,9,7};
		int[] arrtwo = { 1, 2, 8, 4, 9, 7 };

		// Declare for loop iterator from 0 to array length
		// d) Declare a nested for another array from 0 to array length
		// e) Compare Both the arrays using a condition statement
		// f) Print the first array (shoud match item in both arrays)
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arrtwo.length; j++) {
				if (arr[i] == arrtwo[j]) {
					System.out.println("The Matching Value Array Is " + arr[i]);
					break;
				}
			}

		}
	}

}
