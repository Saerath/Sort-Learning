import java.util.*;

public class main {

	final static int ARR_LENGTH = 10000;
	final static int MAX_NUMBER = 50000;
	final static boolean WRITE_TIME = true;

	public static void main(String[] args) {

		System.out.printf("Array length = %d,\nMax element of Array = %d\n", ARR_LENGTH, MAX_NUMBER);

		// build Array with ARR_LENGTH and MAX_NUMBER for each index
		RandomArrayGenerator arrBuilder = new RandomArrayGenerator();
		Sorter sorterBubble = SortNames.BUBBLE.getSorter();
		Sorter sorterInsert = SortNames.INSERT.getSorter();
		Sorter sorterSelect = SortNames.SELECT.getSorter();
		Sorter sorterShaker = SortNames.SHAKER.getSorter();

		ArrayList<Integer> list = arrBuilder.newArray(ARR_LENGTH, MAX_NUMBER);
		List<Sorter> testList = new ArrayList<Sorter>();
		testList.add(sorterShaker);
		testList.add(sorterBubble);
		testList.add(sorterInsert);
		testList.add(sorterSelect);

		for (Sorter s:testList) {
			s.sort(list, WRITE_TIME);
		}

	}

}
