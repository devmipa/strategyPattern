import Sorts.*;

public class Main {

	public static void main(String[] arg) {
		
		int [] arr = new int [] {1,3,5,8,0};
		
		SortSelector s = new SortSelector(new BubleSortDesc());
		
		s.sort(arr);
		
		//print array
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}