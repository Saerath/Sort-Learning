public enum SortNames {
	BUBBLE(new BubbleSorter()), 
	INSERT(new InsertSorter()), 
	SELECT(new SelectSorter()),
	PYRAMID(new PyramidSorter()),
	QUICK(new QuickSorter()),
	SHAKER(new ShakerSorter());

	private Sorter sorter;

	private SortNames(Sorter sorter) {
		this.sorter = sorter;
	}

	public Sorter getSorter() {
		return sorter;
	}

}
