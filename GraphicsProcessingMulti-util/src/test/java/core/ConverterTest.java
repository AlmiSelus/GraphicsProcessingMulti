package core;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class ConverterTest {

	@Test
	public void testGetAndSetRgb() {
		Random random = new Random();
		int randomNumber;
		int[] testArray = new int[3];
		int testedValue;
		for (int i = 0; i < 1000; i++) {
			randomNumber = random.nextInt(256);
			testArray = Converter.getRGB(randomNumber);
			testedValue = Converter.setRGB(testArray[0], testArray[1],
					testArray[2]);
			assertEquals(testedValue, randomNumber);
		}

	}

	@Test
	public void testGetRGB() {
		{
			int[] testArray = { 0, 0, 0 };
			int testValue = 0;
			assertTrue(Arrays.equals(testArray, Converter.getRGB(testValue)));
		}
		{
			int[] testArray = { 255, 255, 255 };
			int testValue = 0xFFFFFF;
			assertTrue(Arrays.equals(testArray, Converter.getRGB(testValue)));
		}
		{
			int[] testArray = { 0xE1, 0x93, 0xCD };
			int testValue = 0xE193CD;
			assertTrue(Arrays.equals(testArray, Converter.getRGB(testValue)));
		}


	}

	@Test
	public void testSetRGB() {
		// fail("Not yet implemented");
	}

	@Test
	public void testBufferedImageToArray() {
		// /fail("Not yet implemented");
	}

	@Test
	public void testArrayToBufferedImage() {
		// fail("Not yet implemented");
	}

	@Test
	public void testToBoolean() {
		// fail("Not yet implemented");
	}

}
