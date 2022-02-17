package SortsTest;
import Sorts.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubleSortAscTest {
	
	SortSelector s;
	int[] arr;
	int[] expectedArr;

	@Test
	void test() {
		s = new SortSelector(new BubleSortAsc());
		arr = new int[] {5,0,1,2,6,7};
		expectedArr = new int [] {0,1,2,5,6,7};
		
		s.sort(arr);
		assertArrayEquals(expectedArr, arr);
		
	}

}
