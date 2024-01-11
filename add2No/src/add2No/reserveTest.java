package add2No;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class reserveTest {
	 @Test
	    public void testReverseArray() {
	        int[] inputArray = {1, 2, 3, 4, 5};
	        int[] expectedArray = {5, 4, 3, 2, 1};
	        int[] reversedArray = reserve.reverseArray(inputArray);

	        assertArrayEquals(expectedArray, reversedArray);
	    }
}
