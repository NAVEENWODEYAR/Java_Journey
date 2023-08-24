package com.data.coding.copy;

public class BinarySearch 
{
	public static int binarySearch(int arr[], int low, int high, int key) {
		int mid = (low + high) / 2;

		while (low <= high) {
			if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] == key) {
				return mid;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}

		if (low > high) {
			return -1;
		}

		return -1;
	}
	public static void main(String[] args)
	{

	}

}
