import java.util.ArrayList;


class Sorter {
	public ArrayList<Integer> selectSort(ArrayList<Integer> list, boolean writeTime){
		
		long time = System.nanoTime()/1000000;
		
		int tempInd;
		
		for (int i = 0; i<list.size(); i++){
			for (int j = i+1; j < list.size(); j++) {
				if (((Integer)list.get(j)).intValue() < ((Integer)list.get(i)).intValue()) {
					tempInd = j;
					list.set(j, list.get(i));
					list.set(i, list.get(tempInd));
				}
			}
		}
		
		System.out.printf("Sorting time = %d ms\n", System.nanoTime()/1000000 - time);
		
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

		System.out.printf("Sorting time = %d ms\n", System.nanoTime()/1000000 - time);
		
		return list;
	}
}
