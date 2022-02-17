package SortsTest;
import Sorts.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubleSortDescTest {
	
	SortSelector s;
	int[] arr, expectedArr;

	@Test
	void test() {
		s = new SortSelector(new BubleSortDesc());
		arr = new int[] {8,0,3,1,7,4};
		expectedArr = new int[] {8,7,4,3,1,0};
		
		s.sort(arr);
		assertArrayEquals(expectedArr,arr);
	}

}
