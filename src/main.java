import java.util.*;

public class main {

	final static int ARR_LENGTH = 10000;
	final static int MAX_NUMBER = 50000;
	final static boolean WRITE_TIME = true;

	public static void main(String[] args) {

//		System.out.printf("Array length = %d,\nMax element of Array = %d\n",
//				ARR_LENGTH, MAX_NUMBER);

		// build Array with ARR_LENGTH and MAX_NUMBER for each index
		RandomArrayGenerator arrBuilder = new RandomArrayGenerator();
		Sorter sorterBubble = SortNames.BUBBLE.getSorter();
		Sorter sorterInsert = SortNames.INSERT.getSorter();
		Sorter sorterSelect = SortNames.SELECT.getSorter();
		Sorter sorterShaker = SortNames.SHAKER.getSorter();

		ArrayList<Integer> list = arrBuilder.newArray(ARR_LENGTH, MAX_NUMBER);
		ArrayList<Integer> listNew = new ArrayList<Integer>(list);

		System.out.println(list);
		sorterBubble.sort(listNew, WRITE_TIME);
		sorterInsert.sort(listNew, WRITE_TIME);
		sorterSelect.sort(listNew, WRITE_TIME);
		sorterShaker.sort(listNew, WRITE_TIME);

	}

}
