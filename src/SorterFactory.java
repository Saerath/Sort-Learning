public class SorterFactory {

	public static Sorter getSorter (String sorterName){
		
		if (sorterName.equals("bubble")){
			Sorter sorter = new BubbleSorter();
			return sorter;
			
		}else if (sorterName.equals("insert")) {
			Sorter sorter = new InsertSorter();
			return sorter;
			
		}else if (sorterName.equals("shaker")) {
			Sorter sorter = new ShakerSorter();
			return sorter;
			
		}else if (sorterName.equals("select")) {
			Sorter sorter = new SelectSorter();
			return sorter;
		}else

		return null;

	}
}
