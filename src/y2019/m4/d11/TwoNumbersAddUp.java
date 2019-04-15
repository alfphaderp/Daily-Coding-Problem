package y2019.m4.d11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This problem was recently asked by Google.
 * 
 * Given a list of numbers and a number k, return whether any two numbers from
 * the list add up to k.
 * 
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
 * 17.
 * 
 * Bonus: Can you do this in one pass?
 */
public class TwoNumbersAddUp {
	public static void main(String[] args) {
		int[] arr = new int[] {10, 15, 3, 7};
		System.out.println(twoNumbersAddUpImperative(arr, 17));
		System.out.println(twoNumbersAddUpFunctional(arr, 17));
	}
	
	public static boolean twoNumbersAddUpImperative(int[] arr, int k) {
		Set<Integer> uniqueNums = new HashSet<>();
		for(int i : arr)
			uniqueNums.add(i);
		for(int i : uniqueNums)
			if(uniqueNums.contains(k - i))
				return true;
		return false;
	}
	
	public static boolean twoNumbersAddUpFunctional(int[] arr, int k) {
		Set<Integer> uniqueNums = Arrays.stream(arr)
				.mapToObj(Integer::valueOf)
				.collect(Collectors.toSet());
		return uniqueNums.stream()
				.anyMatch(i -> uniqueNums.contains(k - i));
	}
}
