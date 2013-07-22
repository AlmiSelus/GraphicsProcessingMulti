package core;

public class MeanFilter {
	

	 

	public int[][] filter(final int[][] RGBArray, final int matrixSize) {
		// argument check
		if (matrixSize < 1)
			throw new IllegalArgumentException(
					"matrixSize mustn't be lower than 1");
		// declarations
		final int surr = matrixSize - 1;// surrounding
		final int rightBound = RGBArray.length;
		final int bottomBound = RGBArray[0].length;
		int result[][] = new int[RGBArray.length][RGBArray[0].length];
		int factors[][] = new int[RGBArray.length][RGBArray[0].length];
		// core
		for (int i = 0; i < RGBArray.length; i++) {
			for (int j = 0; j < RGBArray[0].length; j++) {
				factors[i][j]=iterateOnNeighbours(surr, rightBound, bottomBound, i, j, RGBArray, result);
				result[i][j]=result[i][j]/factors[i][j];
			}
		}
		
//		System.out.println(Arrays.equals(result, RGBArray));
//		for(int i[] : result) {
//			for(int j : i){
//				System.out.println(j);
//			}
//		}
//		System.out.println();
//		System.out.println();
//		
//		for(int i[] : RGBArray) {
//			for(int j : i){
//				System.out.println(j);
//			}
//		}

		return result;
	}

	protected int iterateOnNeighbours(final int surr, final int rightBound, final int bottomBound,final int currentIndexI,final int currentIndexJ, final int[][] RGBArray, final int[][] result) {
		int counter = 0;
		for (int n = (currentIndexI - surr) < 0 ? 0 : (currentIndexI - surr); n < ((currentIndexI + surr) >= rightBound ? rightBound : (currentIndexI+surr+1)); n++) {
			for (int m = (currentIndexJ - surr) < 0 ? 0 : (currentIndexJ - surr); m < ((currentIndexJ + surr) >= bottomBound ? bottomBound : (currentIndexJ+surr+1)); m++) {
				result[currentIndexI][currentIndexJ]+=RGBArray[n][m];
				counter++;
			}
		}
		
		return counter;
	}

}
