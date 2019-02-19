import java.util.*;

public class main {

	final static int ARR_LENGTH = 10;
	final static int MAX_NUMBER = 50000;
	final static boolean WRITE_TIME = true;

	public static void main(String[] args) {

		System.out.printf("Array length = %d,\nMax element of Array = %d\n",
				ARR_LENGTH, MAX_NUMBER);

		RandomArrayGenerator arrBuilder = new RandomArrayGenerator(); // build Array with ARR_LENGTH and MAX_NUMBER for each index
		Sorter sorter = SorterFactory.getSorter(SortNames.BUBBLE);

		ArrayList<Integer> list = arrBuilder.newArray(ARR_LENGTH, MAX_NUMBER);

		sorter.sort(list, WRITE_TIME);

		System.out.println(list);

	}

}
