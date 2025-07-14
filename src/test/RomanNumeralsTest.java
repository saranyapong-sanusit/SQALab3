package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class RomanNumeralsTest {
	
//	TC01 Roman Number: I
	@Test
	void tc01singleDigit() {
		RomanNumerals romeNum = new RomanNumerals();
		int result = romeNum.convertRomanNumToInt("I");
	
		assertEquals(1, result);
		System.out.println(result);
	}
	
//	TC02 Roman Number: IV
	@Test
	void tc02twoDigitFirstSmaller() {
		RomanNumerals romeNum = new RomanNumerals();
		int result = romeNum.convertRomanNumToInt("IV");

		assertEquals(4,result);
		System.out.println(result);
	}

//	TC03 Roman Number: VI
	@Test
	void tc03twoDigitFirstLarger() {
		RomanNumerals romeNum = new RomanNumerals();
		int result = romeNum.convertRomanNumToInt("VI");

		assertEquals(6,result);
		System.out.println(result);
	}
	
//	TC04 Roman Number: II
	@Test
	void tc04twoDigitSameNumber() {
		RomanNumerals romeNum = new RomanNumerals();
		int result = romeNum.convertRomanNumToInt("II");

		assertEquals(2,result);	
		System.out.println(result);
	}

//	TC05 Roman Number: III
	@Test
	void tc05multipleDigitSameNumber() {
		RomanNumerals romeNum = new RomanNumerals();
		int result = romeNum.convertRomanNumToInt("III");

		assertEquals(3,result);	
		System.out.println(result);
	}
	
//	TC06 Roman Number: XVI
	@Test
	void tc06multipleDigitFirstLarger() {
		RomanNumerals romeNum = new RomanNumerals();
		int result = romeNum.convertRomanNumToInt("XVI");

		assertEquals(16,result);	
		System.out.println(result);
	}
	
//	TC07 Roman Number: LXXIV
	@Test
	void tc07multipleDigitFirstLargest() {
		RomanNumerals romeNum = new RomanNumerals();
		int result = romeNum.convertRomanNumToInt("LXXIV");

		assertEquals(74,result);	
		System.out.println(result);
	}
	
//	TC08 Input: A
	@Test
	void tc08notRomanNumber() {
		RomanNumerals romeNum = new RomanNumerals();
		int result = romeNum.convertRomanNumToInt("A");

		System.out.println(result);
	}
	
//	TC09 Input: DD
	@Test
	void tc09wrongRepeatDigit() {
		RomanNumerals romeNum = new RomanNumerals();
		int result = romeNum.convertRomanNumToInt("DD");

		assertEquals(1000,result);
		System.out.println(result);
	}
	
//	TC10 Input: IIIII
	@Test
	void tc10moreThanThreeRepeating() {
		RomanNumerals romeNum = new RomanNumerals();
		int result = romeNum.convertRomanNumToInt("IIIII");

		assertEquals(5,result);	
		System.out.println(result);
	}
}
