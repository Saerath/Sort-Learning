import java.util.List;


public class ShakerSorter implements Sorter{

	public List<Integer> sort(List<Integer> list, boolean writeTime) {
		long time = System.nanoTime()/1000000;
		
		Integer temp;
		
		int leftEdge = 0;
		int rightEdge = list.size()-1;
		int j;
		int count = 0;
		
		do{
			for (j = rightEdge; j > leftEdge; j--) {
				if (list.get(j) < list.get(j-1)) {
					temp = list.get(j);
					list.set(j, list.get(j-1));
					list.set(j-1, temp);
					count = j;
				}
			}
			
			leftEdge = count++;
			
			for (j = leftEdge; j < rightEdge; j++) {
				if (list.get(j) > list.get(j+1)){
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
					count = j;
				}
			}
			
			rightEdge = count--;
			
		}while(rightEdge>leftEdge+1);


		System.out.printf("ShakerSort, Sorting time = %d ms\n", System.nanoTime()/1000000 - time);
		
		return list;
	}

}
