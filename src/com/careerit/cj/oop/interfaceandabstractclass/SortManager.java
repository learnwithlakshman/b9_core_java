package com.careerit.cj.oop.interfaceandabstractclass;

interface Sort{
	
	public abstract void sort(int... a);
		
}

class BubbuleSort implements Sort{

	@Override
	public void sort(int... a) {
		
	}

}
class MergeSort implements Sort{

	@Override
	public void sort(int... a) {
		// TODO Auto-generated method stub
		
	}
	
}
class NumberRepo{
	
		public boolean binarySearch(Sort s,int key, int...arr) {
			s.sort(arr);
			return false;
		}
}
public class SortManager {

		public static void main(String[] args) {
			NumberRepo obj = new NumberRepo();
			obj.binarySearch(new MergeSort(),12,new int[] {4,4,4,5,3,4,5,6});
		}
}
