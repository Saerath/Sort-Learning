import java.util.ArrayList;
import java.util.List;

public class BubbleSorter implements Sorter {

	public List<Integer> sort(List<Integer> list, boolean writeTime) {
		List<Integer> listNew = new ArrayList<Integer>(list);
		long time = System.nanoTime() / 1000000;
		Integer temp;

		for (int i = 0; i < listNew.size(); i++) {

			for (int j = listNew.size() - 1; j > i; j--) {
				if (listNew.get(j) < listNew.get(j - 1)) {
					temp = listNew.get(j);
					listNew.set(j, listNew.get(j - 1));
					listNew.set(j - 1, temp);
				}
			}
		}

		if (writeTime) {
			System.out.printf("BubbleSort, Sorting time = %d ms\n",
					System.nanoTime() / 1000000 - time);
		}

		return listNew;
	}

}
