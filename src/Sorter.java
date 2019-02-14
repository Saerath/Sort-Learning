import java.util.ArrayList;


public class Sorter {
	public ArrayList<Integer> selectSort(ArrayList<Integer> list, boolean writeTime){
		
		long time = System.nanoTime()/1000000;
		
		Integer temp;
		
		for (int i = 0; i<list.size(); i++){
			for (int j = i+1; j < list.size(); j++) {
				if (((Integer)list.get(j)).intValue() < ((Integer)list.get(i)).intValue()) {
					temp = list.get(j);
					list.set(j, list.get(i));
					list.set(i, temp);
				}
			}
		}
		
		System.out.printf("Sorting time = %d ms\n", System.nanoTime()/1000000 - time);
		
		return list;
	}
}