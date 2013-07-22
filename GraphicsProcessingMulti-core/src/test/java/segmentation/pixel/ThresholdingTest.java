package segmentation.pixel;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ThresholdingTest {

	private static final Thresholding test = new Thresholding();

	@Test
	public void testMainMethod() {
		{
			int[][] testArgumentArray = { { 1, 15, 30, 45 },
					{ 60, 80, 90, 100 }, { 110, 140, 180, 190 },
					{ 200, 220, 250, 255 } };
			int[] testArgumentBorders = { 101 };
			int[][] testResult = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 },
					{ 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

			for (int i = 0; i < testArgumentArray.length; i++) {
				assertTrue(Arrays
						.equals(testResult[i], test.process(testArgumentArray,
								testArgumentBorders)[i]));
			}

		}
		
		{
			int[][] testArgumentArray = { { 1, 15, 30, 45 },
					{ 60, 80, 90, 100 }, { 110, 140, 180, 190 },
					{ 200, 220, 250, 255 } };
			int[] testArgumentBorders = { 250 };
			int[][] testResult = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 },
					{ 1, 1, 1, 1 }, { 1, 1, 0, 0 } };

			for (int i = 0; i < testArgumentArray.length; i++) {
				assertTrue(Arrays
						.equals(testResult[i], test.process(testArgumentArray,
								testArgumentBorders)[i]));
			}

		}
		
		{
			int[][] testArgumentArray = { { 1, 15, 30, 45 },
					{ 60, 80, 90, 100 }, { 110, 140, 180, 190 },
					{ 200, 220, 250, 255 } };
			int[] testArgumentBorders = { 101, 251 };
			int[][] testResult = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 },
					{ 2, 2, 2, 2 }, { 2, 2, 2, 0 } };

			for (int i = 0; i < testArgumentArray.length; i++) {
				assertTrue(Arrays
						.equals(testResult[i], test.process(testArgumentArray,
								testArgumentBorders)[i]));
			}

		}
		
		{
			int[][] testArgumentArray = { { 1, 15, 30, 45 },
					{ 60, 80, 90, 100 }, { 110, 140, 180, 190 },
					{ 200, 220, 250, 255 } };
			int[] testArgumentBorders = { 101, 251, 50 };
			int[][] testResult = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 },
					{ 3, 3, 3, 3 }, { 3, 3, 3, 0 } };

			for (int i = 0; i < testArgumentArray.length; i++) {
				assertTrue(Arrays
						.equals(testResult[i], test.process(testArgumentArray,
								testArgumentBorders)[i]));
			}

		}

	}
	
	@Test
	public void testSecondaryMethod() {
		
		{
			int[][] testArgumentArray = { { 1, 15, 30, 45 },
					{ 60, 80, 90, 100 }, { 110, 140, 180, 190 },
					{ 200, 220, 250, 255 } };
			int testArgumentBorder = 101;
			Boolean[][] testResult = { { true, true, true, true }, { true, true, true, true },
					{ false, false, false, false }, { false, false, false, false } };

			for (int i = 0; i < testArgumentArray.length; i++) {
				assertTrue(Arrays
						.equals(testResult[i], test.process(testArgumentArray,
								testArgumentBorder)[i]));
			}

		}
		
		
		
	}

}
