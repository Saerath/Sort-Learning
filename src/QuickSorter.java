import java.util.ArrayList;
import java.util.List;

public class QuickSorter implements Sorter {

	public List<Integer> sort(List<Integer> list, boolean writeTime) {
		List<Integer> listNew = new ArrayList<Integer>(list);
		long time = System.nanoTime() / 1000000;
		
		qsort(listNew, list.size());
		
		if (writeTime) {
			System.out.printf("InsertSort, Sorting time = %d ms\n",
					System.nanoTime() / 1000000 - time);
		}

		return listNew;
	}

	private List<Integer> qsort(List<Integer> list, int N) {
		
		int i = 0;
		int j = N-1;
		int p = N/2;
		int temp;
		
		do {
			//searching element that bigger than a[p]
			while (list.get(i) < list.get(p)) {
				i++;
			}
			
			//searching element than lesser than [p]
			while (list.get(j) > list.get(p)) {
				j--;
			}
			
			if (i <= j) {
				temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
				i++;
				j--;
			}
			
		} while (i <= j);
				
		if (j > 0) {
			qsort(list, N);
		}
		
		if (N > i) {
			qsort(list,N-i);
		}
		
		return list;
	}

}
