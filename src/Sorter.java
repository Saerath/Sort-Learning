import java.util.ArrayList;

//Class includes some sorting methods

class Sorter {
	public ArrayList<Integer> selectSort(ArrayList<Integer> list, boolean writeTime){
		
		long time = System.nanoTime()/1000000;
		
		Integer temp, min;
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
	
	public ArrayList<Integer> insertSort(ArrayList<Integer> list, boolean writeTime){
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
	
	public ArrayList<Integer> bubbleSort(ArrayList<Integer> list, boolean writeTime){
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
	
	public ArrayList<Integer> shakerSort(ArrayList<Integer> list, boolean writeTime){
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
