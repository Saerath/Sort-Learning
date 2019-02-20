import java.util.ArrayList;
import java.util.List;

public class ShakerSorter implements Sorter {

	public List<Integer> sort(List<Integer> list, boolean writeTime) {
		long time = System.nanoTime() / 1000000;
		List<Integer> listNew = new ArrayList<Integer>();
		listNew = list;

		Integer temp;

		int leftEdge = 0;
		int rightEdge = listNew.size() - 1;
		int j;
		int count = 0;

		do {
			for (j = rightEdge; j > leftEdge; j--) {
				if (listNew.get(j) < listNew.get(j - 1)) {
					temp = listNew.get(j);
					listNew.set(j, listNew.get(j - 1));
					listNew.set(j - 1, temp);
					count = j;
				}
			}

			leftEdge = count++;

			for (j = leftEdge; j < rightEdge; j++) {
				if (listNew.get(j) > listNew.get(j + 1)) {
					temp = listNew.get(j);
					listNew.set(j, listNew.get(j + 1));
					listNew.set(j + 1, temp);
					count = j;
				}
			}

			rightEdge = count--;

		} while (rightEdge > leftEdge + 1);

		if (writeTime) {
			System.out.printf("ShakerSort, Sorting time = %d ms\n",
					System.nanoTime() / 1000000 - time);
		}

		return listNew;
	}

}
