import java.util.ArrayList;


public class Sorter {
	public static ArrayList<Integer> selectSort(ArrayList<Integer> list){
		
		
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
		
		
		return list;
	}
}
