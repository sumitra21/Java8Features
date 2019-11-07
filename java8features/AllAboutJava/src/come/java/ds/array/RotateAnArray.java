package come.java.ds.array;

import java.util.Arrays;

public class RotateAnArray {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		reverseAnArrayUsingTwoPointers(arr,arr.length);
		System.out.println("After Reverse :: "+ Arrays.toString(arr));
		//rotateArrayByShifting(arr,3,7);
		//System.out.println("Array after Rotation :: "+Arrays.toString(arr));
		

	}

	private static void reverseAnArrayUsingTwoPointers(int[] arr, int length) {
		int i = 0;
		int j = length -1;
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
			
			if(i > j)
				break;
		}
		
	}

	private static void rotateArrayByShifting(int[] arr, int d, int n) {
		
		for(int i = 0; i< d; i++) {
			leftRotateByOne(arr,n);
		}
		
	}

	@SuppressWarnings("unused")
	private static void leftRotateByOne(int[] arr, int n) {
		int temp = 0;
		int i = 0;
		temp = arr[0];
		for(i = 0; i< n-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}

}
