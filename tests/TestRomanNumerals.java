import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test (expected = Exception.class)
	public void testIllegalRepeatTriple() throws Exception {
		RomanNumerals num = new RomanNumerals();
		num.convertToInteger("DMCCCCV");
	}
	
	@Test (expected = Exception.class)
	public void testIllegalRepeatDouble() throws Exception {
		RomanNumerals num = new RomanNumerals();
		num.convertToInteger("DMCCVV");
	}
	
	@Test (expected = Exception.class)
	public void testIllegalSymbol() throws Exception {
		RomanNumerals num = new RomanNumerals();
		num.convertToInteger("B");
	}
	
	@Test
	public void testSingles() throws Exception {
		RomanNumerals num = new RomanNumerals();
		assertEquals(1,num.convertToInteger("I"));
		assertEquals(5,num.convertToInteger("V"));
		assertEquals(10,num.convertToInteger("X"));
		assertEquals(50,num.convertToInteger("L"));
		assertEquals(100,num.convertToInteger("C"));
		assertEquals(500,num.convertToInteger("D"));
		assertEquals(1000,num.convertToInteger("M"));
	}
	
	@Test
	public void testDoubles() throws Exception {
		RomanNumerals num = new RomanNumerals();
		assertEquals(2,num.convertToInteger("II"));
		assertEquals(20,num.convertToInteger("XX"));
		assertEquals(200,num.convertToInteger("CC"));
		assertEquals(2000,num.convertToInteger("MM"));
	}
	
	@Test
	public void testAddition() throws Exception {
		RomanNumerals num = new RomanNumerals();
		assertEquals(11,num.convertToInteger("XI"));
		assertEquals(15,num.convertToInteger("XV"));
		assertEquals(32,num.convertToInteger("XXXII"));
		assertEquals(102,num.convertToInteger("CII"));
		assertEquals(2016,num.convertToInteger("MMXVI"));
	}
	
	@Test
	public void testSubstraction() throws Exception {
		RomanNumerals num = new RomanNumerals();
		assertEquals(4,num.convertToInteger("IV"));
		assertEquals(9,num.convertToInteger("IX"));
		assertEquals(14,num.convertToInteger("XIV"));
		assertEquals(19,num.convertToInteger("XIX"));
		assertEquals(49,num.convertToInteger("XLIX"));
		assertEquals(2453,num.convertToInteger("MMCDLIII"));
	}
	
	@Test (expected = Exception.class)
	public void testIllegalSubstraction() throws Exception {
		RomanNumerals num = new RomanNumerals();
		num.convertToInteger("VL");
		num.convertToInteger("VD");
	}

}
