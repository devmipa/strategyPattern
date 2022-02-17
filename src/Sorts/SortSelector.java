package Sorts;

public class SortSelector {
	
	SortType sortingType;
	
	public SortSelector(SortType sortingType) {
		this.sortingType = sortingType;
	}
	
	public void sort(int[] arr) {
		this.sortingType.sort(arr);
	}

}
