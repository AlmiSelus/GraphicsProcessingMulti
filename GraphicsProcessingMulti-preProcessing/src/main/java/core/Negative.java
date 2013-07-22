
package core;


public class Negative {


	
	public int[][] filter(final int[][] RGBArray) {
		int result[][] = new int[RGBArray.length][RGBArray[0].length];
		for (int i = 0; i < RGBArray.length; i++) {
			for (int j = 0; j < RGBArray[0].length; j++) {
				result[i][j] = 255 - RGBArray[i][j];
			}
		}
		return result;
	}

}
