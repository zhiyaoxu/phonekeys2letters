package com.xzy.phonekeys2letters;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * Unit test for PhoneKeyConverter.
 */
public class PhoneKeyConverterTest 
{
	private static PhoneKeyConverter phonekeyConverter = new PhoneKeyConverter();
	
	//main function of letter combination test
	@Test
	public void combineLettersTest() {
		phonekeyConverter.initialize();
		String testInput = "46,99";
		//List<String> result = phonekeys2letters.combineLetters(testInput);
		System.out.println(phonekeyConverter.combineLetters(testInput));
		//assertEquals("[tm, tn, to, um, un, uo, vm, vn, vo]", phonekeyConverter.combineLetters(testInput));
	}
	
	//boundary input test
	//input can be single input or double input
	//for example: ",819", "18,", "38", "6", "187", "87,99", "371,756"
	@Test
	public void digitInputTest() {
		phonekeyConverter.initialize();
		String testInput = "3,593";
		System.out.println(phonekeyConverter.combineLetters(testInput));
	}
}
