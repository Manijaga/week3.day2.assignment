package week3.day2;

import java.util.Iterator;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] numbers = { 4, 6, 7, 2, 3, 1, 9, 10, 8, 8, 6, 2 };

		// Remove duplicate using set
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			set.add(numbers[i]);
		}
		// order set
		System.out.println(set);
		Iterator<Integer> numbersIterator = set.iterator();

		for (int i = 1; i < set.size(); i++) {
			if ((numbersIterator.next()) != i) {
				System.out.println("The Missing value is " + i);
				i = i + 1;
			}
		}

	}

}
