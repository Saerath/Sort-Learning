import java.util.ArrayList;
import java.util.List;

public class InsertSorter implements Sorter {

	public List<Integer> sort(List<Integer> list, boolean writeTime) {
		long time = System.nanoTime() / 1000000;
		List<Integer> listNew = new ArrayList<Integer>();
		listNew = list;

		for (int i = 0; i < listNew.size(); i++) {
			Integer x = listNew.get(i);

			for (int j = i - 1; (j >= 0) && (x < listNew.get(j)); j--) {
				listNew.set(j + 1, list.get(j));
				listNew.set(j, x);
			}

		}

		if (writeTime) {
			System.out.printf("InsertSort, Sorting time = %d ms\n",
					System.nanoTime() / 1000000 - time);
		}

		return listNew;
	}

}
