import java.util.*;
import java.lang.*;


public class main {

	final static int ARR_LENGTH = 200;
	final static int MAX_NUMBER = 50000;
	final static boolean WRITE_TIME = true;
	
	public static void main(String[] args) {
		
		System.out.printf("Array length = %d,\nMax element of Array = %d\n", ARR_LENGTH, MAX_NUMBER);
		
		ArrayBuilder arrBuilder = new ArrayBuilder(); //build Array with ARR_LENGTH and MAX_NUMBER for each index
		Sorter sorter = new Sorter(); //sorter class with some methods to sort ArrayList<Integer>
		ArrayList<Integer> list = arrBuilder.newArray(ARR_LENGTH, MAX_NUMBER);
//		ArrayList<Integer> list2 = arrBuilder.newArray(ARR_LENGTH, MAX_NUMBER);
		ArrayList<Integer> listSortedInsert = new ArrayList<Integer>();
		ArrayList<Integer> listSortedSelect = new ArrayList<Integer>();

//		listSortedInsert = sorter.insertSort(list, WRITE_TIME);
		listSortedSelect = sorter.selectSort(list, WRITE_TIME);

		System.out.println(list);
	}

	

}
