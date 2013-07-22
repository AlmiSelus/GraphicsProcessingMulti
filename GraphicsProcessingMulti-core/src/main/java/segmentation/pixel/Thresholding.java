package segmentation.pixel;

import java.util.Arrays;

import core.Converter;

public class Thresholding {

	/**
	 * segments RGB array according to given borders.
	 * 
	 * @param RGBArray
	 *            Array of RGB
	 * @param borders
	 *            array of RGB values
	 * @return array with size of given RGBarray with values indicating
	 *         segmentation.
	 */

	public int[][] process(final int[][] RGBArray, int[] borders) {
		Arrays.sort(borders);
		int[][] result = new int[RGBArray.length][RGBArray[0].length];
		for (int n = 0; n < borders.length; n++) {
			for (int i = 0; i < RGBArray.length; i++) {
				for (int j = 0; j < RGBArray[0].length; j++) {
					if (result[i][j] == 0 && RGBArray[i][j] < borders[n]) {
						result[i][j]=n+1;
					}
				}
			}

		}

		return result;
	}

	/**
	 * segments RGB array according to given border.
	 * 
	 * @param RGBArray
	 *            Array of RGB
	 * @param border
	 *            RGB value
	 * @return Boolean value indicating segmentation. True = object of interests
	 *         False = background
	 */
	public Boolean[][] process(int[][] RGBArray, int border) {
		int[] array = { border };
		int[][] resultInts = process(RGBArray, array);
		Boolean[][] result = new Boolean[resultInts.length][resultInts[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = Converter.toBoolean(resultInts[i][j]);
			}
		}

		return result;
	}

}
