import java.lang.reflect.Array;
import java.util.*;

public class main {

	final static int ARR_LENGTH = 15;
	final static int MAX_NUMBER = 99;
	final static boolean WRITE_TIME = true;
	
	static Integer[] arr = {4, 8, 3, 1, 7, 5, 2, 12, 13, 10, 9, 6, 14, 11, 15};

	public static void main(String[] args) {

		System.out.printf("Array length = %d,\nMax element of Array = %d\n", ARR_LENGTH, MAX_NUMBER);

		// build Array with ARR_LENGTH and MAX_NUMBER for each index
		RandomArrayGenerator arrBuilder = new RandomArrayGenerator();

		Sorter sorterPyramid = SortNames.PYRAMID.getSorter();

		ArrayList<Integer> list = arrBuilder.newArray(ARR_LENGTH, MAX_NUMBER);
		List<Sorter> testList = new ArrayList<Sorter>();
		testList.add(sorterPyramid);
		ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
		
		

		for (Sorter s:testList) {
			System.out.println(list);
			System.out.println(s.sort(list, WRITE_TIME));
		}

	}

}
