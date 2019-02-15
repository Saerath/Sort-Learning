import java.util.List;


public class BubbleSorter implements Sorter{

	public List<Integer> sort(List<Integer> list, boolean writeTime) {
		long time = System.nanoTime()/1000000;
		
		Integer temp;
		
		for (int i = 0; i < list.size(); i++) {
			
			for (int j = list.size()-1; j > i; j--) {
				if (list.get(j) < list.get(j-1)) {
					temp = list.get(j);
					list.set(j, list.get(j-1));
					list.set(j-1, temp);
				}
			}
		}

		System.out.printf("BubbleSort, Sorting time = %d ms\n", System.nanoTime()/1000000 - time);
		
		return list;
	}

}
