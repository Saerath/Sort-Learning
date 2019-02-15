import java.util.List;


public class SelectSorter implements Sorter{

	public List<Integer> sort(List<Integer> list, boolean writeTime) {
		long time = System.nanoTime()/1000000;
		
		Integer min;
		int minInd;
		
		for (int i = 0; i<list.size(); i++){
			
			minInd = i;
			min = list.get(i);
			
			for (int j = i+1; j < list.size(); j++) {
				if (((Integer)list.get(j)).intValue() < min) {
					minInd = j;
					min = list.get(j);
				}
			}

			list.set(minInd, list.get(i));
			list.set(i, min);

		}
		
		
		System.out.printf("SelectSort, Sorting time = %d ms\n", System.nanoTime()/1000000 - time);
		
		return list;
	}

}
