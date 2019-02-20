import java.util.ArrayList;
import java.util.List;

public class SelectSorter implements Sorter {

	public List<Integer> sort(List<Integer> list, boolean writeTime) {
		long time = System.nanoTime() / 1000000;
		List<Integer> listNew = new ArrayList<Integer>();
		listNew = list;

		Integer min;
		int minInd;

		for (int i = 0; i < listNew.size(); i++) {

			minInd = i;
			min = listNew.get(i);

			for (int j = i + 1; j < listNew.size(); j++) {
				if (((Integer) listNew.get(j)).intValue() < min) {
					minInd = j;
					min = listNew.get(j);
				}
			}

			listNew.set(minInd, listNew.get(i));
			listNew.set(i, min);

		}

		if (writeTime) {
			System.out.printf("SelectSort, Sorting time = %d ms\n",
					System.nanoTime() / 1000000 - time);
		}

		return listNew;
	}

}
