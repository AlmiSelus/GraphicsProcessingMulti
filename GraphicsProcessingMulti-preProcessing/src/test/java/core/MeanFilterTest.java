package core;

import static org.junit.Assert.*;
import org.junit.Test;

public class MeanFilterTest {
	static final MeanFilter test = new MeanFilter();

	@Test
	public void testFilter() {
		{
		int[][] testResult= 
			{{ 1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
				};
		
		int[][] testArgument= 
			{{ 1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
				};
		
		 assertArrayEquals(testResult, test.filter(testArgument,2));
		}
		
		{
		int[][] testResult= 
			{{ 2, 2, 2, 2},
				{2, 2, 2, 2},
				{2, 2, 2, 2},
				{2, 2, 2, 2}
				};;
		
		int[][] testArgument= 
			{{ 2, 2, 2, 2},
				{2, 2, 2, 2},
				{2, 2, 2, 2},
				{2, 2, 2, 2}
				};;
		
		 assertArrayEquals(testResult, test.filter(testArgument,2));
		}
		
		{
		int[][] testResult= 
			{{ 1, 0, 1, 1},
				{1, 0, 1, 1},
				{1, 0, 1, 1},
				{1, 0, 1, 1}
				};;
		
		int[][] testArgument= 
			{{ 0, 2, 0, 2},
				{0, 2, 0, 2},
				{0, 2, 0, 2},
				{0, 2, 0, 2}
				};;
		
		 assertArrayEquals(testResult, test.filter(testArgument,2));
		}
	
	}

	@Test
	public void testIterateOnNeighbours() {
		final int[][] fakeArray = new int[100][100];
		assertEquals(1, test.iterateOnNeighbours(0, 100, 100, 0, 0, fakeArray,
				fakeArray));
		assertEquals(1, test.iterateOnNeighbours(0, 100, 100, 1, 0, fakeArray,
				fakeArray));
		assertEquals(1, test.iterateOnNeighbours(0, 100, 100, 2, 0, fakeArray,
				fakeArray));
		assertEquals(1, test.iterateOnNeighbours(0, 100, 100, 1, 1, fakeArray,
				fakeArray));
		assertEquals(1, test.iterateOnNeighbours(0, 100, 100, 1, 2, fakeArray,
				fakeArray));
		assertEquals(1, test.iterateOnNeighbours(0, 100, 100, 0, 2, fakeArray,
				fakeArray));
		assertEquals(1, test.iterateOnNeighbours(0, 100, 100, 0, 1, fakeArray,
				fakeArray));
		assertEquals(1, test.iterateOnNeighbours(0, 100, 100, 99, 99,
				fakeArray, fakeArray));
		assertEquals(1, test.iterateOnNeighbours(0, 100, 100, 98, 99,
				fakeArray, fakeArray));
		assertEquals(1, test.iterateOnNeighbours(0, 100, 100, 99, 99,
				fakeArray, fakeArray));

		assertEquals(4, test.iterateOnNeighbours(1, 100, 100, 0, 0, fakeArray,
				fakeArray));
		assertEquals(6, test.iterateOnNeighbours(1, 100, 100, 1, 0, fakeArray,
				fakeArray));
		assertEquals(6, test.iterateOnNeighbours(1, 100, 100, 0, 1, fakeArray,
				fakeArray));
		assertEquals(9, test.iterateOnNeighbours(1, 100, 100, 1, 1, fakeArray,
				fakeArray));

		assertEquals(4, test.iterateOnNeighbours(1, 100, 100, 99, 99,
				fakeArray, fakeArray));
		assertEquals(6, test.iterateOnNeighbours(1, 100, 100, 98, 99,
				fakeArray, fakeArray));
		assertEquals(6, test.iterateOnNeighbours(1, 100, 100, 99, 98,
				fakeArray, fakeArray));
		assertEquals(9, test.iterateOnNeighbours(1, 100, 100, 98, 98,
				fakeArray, fakeArray));

		assertEquals(9, test.iterateOnNeighbours(2, 100, 100, 0, 0, fakeArray,
				fakeArray));
		assertEquals(12, test.iterateOnNeighbours(2, 100, 100, 1, 0, fakeArray,
				fakeArray));
		assertEquals(12, test.iterateOnNeighbours(2, 100, 100, 0, 1, fakeArray,
				fakeArray));
		assertEquals(16, test.iterateOnNeighbours(2, 100, 100, 1, 1, fakeArray,
				fakeArray));
		assertEquals(25, test.iterateOnNeighbours(2, 100, 100, 2, 2, fakeArray,
				fakeArray));

		assertEquals(9, test.iterateOnNeighbours(2, 100, 100, 99, 99,
				fakeArray, fakeArray));
		assertEquals(12, test.iterateOnNeighbours(2, 100, 100, 98, 99,
				fakeArray, fakeArray));
		assertEquals(12, test.iterateOnNeighbours(2, 100, 100, 99, 98,
				fakeArray, fakeArray));
		assertEquals(16, test.iterateOnNeighbours(2, 100, 100, 98, 98,
				fakeArray, fakeArray));
		assertEquals(25, test.iterateOnNeighbours(2, 100, 100, 97, 97,
				fakeArray, fakeArray));
	}

}
