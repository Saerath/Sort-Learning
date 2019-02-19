public class SorterFactory {

	public static Sorter getSorter(SortNames sorterName) {

		switch (sorterName) {
		case BUBBLE:
			return new BubbleSorter();
		case INSERT:
			return new InsertSorter();
		case SHAKER:
			return new ShakerSorter();
		case SELECT:
			return new SelectSorter();
		default:
			break;
		}

		return null;

	}
}
