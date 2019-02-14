import java.util.*;
import java.lang.*;


public class main {

	final static int ARR_LENGTH = 20;
	final static int MAX_NUMBER = 5000;
	
	public static void main(String[] args) {
		
		
		ArrayBuilder arrBuilder = new ArrayBuilder();
		Sorter sorter = new Sorter();
		ArrayList list = arrBuilder.newArray(ARR_LENGTH, MAX_NUMBER);
		
		System.out.println(list);
		System.out.println(sorter.selectSort(list));
		
		
		
	}
	

	

}
