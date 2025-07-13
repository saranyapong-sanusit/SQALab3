package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class RomanNumeralsTest {
	
	@Test
	void romanConverter() {
		RomanNumerals romeNum = new RomanNumerals();
		int result = romeNum.convertRomanNumToInt("IV");
		
		System.out.print(result);
		assertEquals(5, result);
	}


}
