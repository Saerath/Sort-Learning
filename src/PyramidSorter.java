import java.util.ArrayList;
import java.util.List;

public class PyramidSorter implements Sorter {

	public List<Integer> sort(List<Integer> list, boolean writeTime) {
		List<Integer> listNew = new ArrayList<Integer>(list);
		long time = System.nanoTime() / 1000000;
		
		int N = listNew.size();
		
		for (int k = N/2; k > 0; k--) {
			downHeap(listNew, k, N);		
		}
		
		do {
			int T = listNew.get(0);
			listNew.set(0, listNew.get(N-1));
			listNew.set(N-1, T);
			
			N = N-1;
			downHeap(listNew, 1, N);
			
		} while (N > 1);

		if (writeTime) {
			System.out.printf("PyramidSort, Sorting time = %d ms\n",
					System.nanoTime() / 1000000 - time);
		}

		return listNew;
	}
	
	public void downHeap(List<Integer> listNew, int k, int N){
		int T = listNew.get(k-1);
		
		while (k <= N/2) {
			
			int j = 2*k;
			
			if((j < N) && (listNew.get(j) > listNew.get(j-1))) j++;
			
			if (T >= listNew.get(j-1)) {
				break;
			} else {
				listNew.set(k-1, listNew.get(j-1));
				k = j;
			}	
			
		}
		
		listNew.set(k-1, T);
	}

}
