package com.careerit.cj.collections;

import java.util.Arrays;

class MyList {

	 int[] arr = new int[3];
	private int count = 0;

	public void add(int ele) {
		
		if(count == arr.length) {
			int[] temp = new int[arr.length + arr.length / 2];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
		}
		arr[count++] = ele;
	}

	public void delete(int index) {
	
			if(index >= 0 && index <=count) {
				int[] temp = new int[arr.length - 1];
				System.arraycopy(arr, 0, temp, 0, index);
				System.arraycopy(arr, index+1, temp, index, arr.length - index - 1);
				arr = temp;
				count--;
			}else {
				System.out.println("Index out of range");
			}
		
	}

	public void add(int pos, int ele) {
		// Write your logic 
	}

	public void showElements() {
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}
	}
}

public class DynamicArray {

	public static void main(String[] args) {
		MyList obj = new MyList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		System.out.println(Arrays.toString(obj.arr));
		obj.delete(2);
		obj.delete(7);
		obj.delete(2);
		System.out.println(Arrays.toString(obj.arr));
		obj.showElements();
	}
}
