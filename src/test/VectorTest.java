package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cap1.arrays.Vector;

class VectorTest {

	@Test
	void test() {
	//step 1. Instantiate the tested class
	Vector testedVector = new Vector(10);
	//Step 2. Create the expected value variable
	int [] expectedValue = new int[10];
	expectedValue[0]=999;
	//Step 3. Obtain the actual value
	int [] actualValue = testedVector.insertElement(999,0);
	//Step 4. Compare the expected versus actual values
	assertArrayEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSerch() {
	//step 1. Instantiate the tested class
	Vector testedVector = new Vector(10);
	//Step 2. Create the expected value variable
	int expectedValue = 999;
	testedVector.insertElement(expectedValue,9);
	//Step 3. Obtain the actual value
	int actualValue = testedVector.searchElement(9);
	//Step 4. Compare the expected versus actual values
	assertEquals(expectedValue, actualValue);
	}
	
}
