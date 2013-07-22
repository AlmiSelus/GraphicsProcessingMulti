package core;

import java.awt.image.BufferedImage;

/**
 * Utility class noninstantiable.
 * @author Maciej Nowicki
 *
 */

public final class Converter {
	
	private Converter() {
		throw new AssertionError();
		}
	
	/**
	 * 
	 * @param a RGB sum value
	 * @return array of RGB values
	 */
	
	public static int[] getRGB(int a) {
		int array[] = new int[3];
		array[0] = (a & 0x00ff0000) >> 16;
		array[1] = (a & 0x0000ff00) >> 8;
		array[2] = a & 0x000000ff;
		return array;
	}
	
	/**
	 * @param r red value
	 * @param g green value
	 * @param b blue value
	 * @return RGB value
	 */

	public static int setRGB(int r, int g, int b) {
		int rgb = 0;
		rgb = r << 16;
		rgb += g << 8;
		rgb += b;
		return rgb;
	}
	
	/**
	 * creates RGB array according to BufferedImage
	 * @param image BufferedImage
	 * @return RGB array of RGB
	 */
	
	
	public static <T extends BufferedImage> int[][] bufferedImageToArray(T image){
		int[][] RGBArray = new int[image.getWidth()][image.getHeight()];
		for (int i = 0; i < image.getWidth(); i++) {
			for (int j = 0; j < image.getHeight(); j++) {
				RGBArray[i][j] = image.getRGB(j, i);
			}
		}
		return RGBArray;
		
	}
	
	/**
	 * Creates BufferedImage from array of RGB values
	 * @param RGBArray
	 * @param imageType imagetype int value from BufferedImage
	 * @return BufferedImage
	 */
	
	public static BufferedImage arrayToBufferedImage(int[][] RGBArray, final int imageType) {

		BufferedImage image = new BufferedImage(RGBArray.length, RGBArray[0].length, imageType);
		for (int i = 0; i < image.getHeight(); i++) {
			for (int j = 0; j < image.getWidth(); j++) {
				RGBArray[i][j] = image.getRGB(j, i);
			}
		}
		return image;
	}
	
	/**
	 * Converts an int to a boolean using the convention that zero is false.
	 * @param value
	 * @return boolean
	 */
	
	public static Boolean toBoolean(int value) {
		return value==0 ? false : true;
	}
	
	

	
	

}
