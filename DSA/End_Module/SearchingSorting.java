
package com.file.dsa;

public class SearchingSorting {

	//insertion Sort
	public static void insertionSort(int arr[]) {
		
		for (int i = 1; i< arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1]=key;
		}
	}
	
	//binary search
	public static int binarySearch(int arr[], int key) {
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low) /2;
			
			if(arr[mid] == key) {
				return mid;
			} else if (arr[mid] <key) {
				low = mid + 1;
			}else {
				high = mid -1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = { 50, 20,40,10,30};
				
		System.out.println("Before Sorting:");
		
		for(int x : arr) {
			System.out.println(x + "");
		}
		
		insertionSort(arr);
		
		System.out.println("\nAfter Insertion Sort");
		
		for(int x: arr) {
			System.out.println(x + " ");
		}
		
		int key = 40;
		
		int result = binarySearch(arr, key);
		
		if(result != -1) {
			System.out.println("Element found at index: "+ result);
			
		}else {
			System.out.println("\nElement not found");
		}
	}
}
