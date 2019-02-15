import java.util.List;


public class InsertSorter implements Sorter{

	public List<Integer> sort(List<Integer> list, boolean writeTime) {
		long time = System.nanoTime()/1000000;
		
		for (int i = 0; i < list.size(); i++) {
			Integer x = list.get(i);
			
			for (int j = i-1; (j >= 0) && (x < list.get(j)); j--) {
				list.set(j+1, list.get(j));
				list.set(j, x);
			}
			
		}

		System.out.printf("InsertSort, Sorting time = %d ms\n", System.nanoTime()/1000000 - time);
		
		return list;
	}

}
