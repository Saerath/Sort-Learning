import java.util.*;
import java.lang.*;


public class main {

	final static int ARR_LENGTH = 20000;
	final static int MAX_NUMBER = 5000;
	final static boolean WRITE_TIME = true;
	
	public static void main(String[] args) {
		
		System.out.printf("Array length = %d,\nMax element of Array = %d\n", ARR_LENGTH, MAX_NUMBER);
		
		ArrayBuilder arrBuilder = new ArrayBuilder();
		Sorter sorter = new Sorter();
		ArrayList<Integer> list = arrBuilder.newArray(ARR_LENGTH, MAX_NUMBER);
		
//		System.out.println(list);
//		System.out.println(Sorter.selectSort(list, true));
		sorter.selectSort(list, WRITE_TIME);
	
		
		
		
	}
	

	

}
