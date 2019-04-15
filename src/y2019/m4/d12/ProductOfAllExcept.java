package y2019.m4.d12;

import java.util.Arrays;

/**
 * This problem was asked by Uber.
 * 
 * Given an array of integers, return a new array such that each element at
 * index i of the new array is the product of all the numbers in the original
 * array except the one at i.
 * 
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
 * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
 * be [2, 3, 6].
 * 
 * Follow-up: what if you can't use division?
 */
public class ProductOfAllExcept {
	public static void main(String[] args) {
		int[] arr = new int[] {2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(productOfAllExcept(arr)));
	}
	
	public static int[] productOfAllExcept(int[] arr) {
		if(arr.length <= 1)
			throw new IllegalArgumentException("Input length must be >= 1");
		
		int[] products = new int[arr.length];
		
		int cumulativeProduct = 1;
		for(int i : arr)
			cumulativeProduct *= i;
		
		for(int i = 0; i < arr.length; i++)
			products[i] = cumulativeProduct / arr[i];
		
		return products;
	}
	
	public static int[] productOfAllExceptNoDiv(int[] arr) {
		if(arr.length <= 1)
			throw new IllegalArgumentException("Input length must be >= 1");
		
		int[] products = new int[arr.length];
		products[0] = 1;
		
		int cumulativeProduct = 1;
		for(int i = 0; i < arr.length - 1; i++) {
			cumulativeProduct *= arr[i];
			products[i + 1] = cumulativeProduct;
		}
		
		cumulativeProduct = 1;
		for(int i = arr.length - 1; i > 0; i--) {
			cumulativeProduct *= arr[i];
			products[i - 1] *= cumulativeProduct;
		}
		
		return products;
	}
}
