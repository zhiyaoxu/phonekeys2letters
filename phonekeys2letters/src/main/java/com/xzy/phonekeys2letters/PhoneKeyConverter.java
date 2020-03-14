package com.xzy.phonekeys2letters;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * Author: Xu, Zhiyao
 * Time: 2020-03-13
 * Desciption:
 * convert the digital input to the alphabet combinations
 * according to the telephone pad layout matrix
 *
 */
public class PhoneKeyConverter
{
    private static Map<String, String> map;
	
    public static void main(String[] args) {
        initialize();               				//System initialize
        String str = "8,3";       					//user inputs, format example "9", "8,6" or "81,86"
        System.out.println(combineLetters(str));    //output
    }
    
    protected static void initialize() {
    	// a map of the telephone pad layout, empty for 0 and 1
    	map = new HashMap<String, String>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");   	
    }
    
    protected static List<String> combineLetters(String digits){
    	List<String> outList = new ArrayList<String>();
    	if (digits == null || digits.length() == 0) {
    		outList.add("Error! Empty Input!");
    		return outList;
    	}
    	else {
    		//take out all special characters and 0, 1
    		String[] inputs = digits.split(",");
    		//System.out.println(inputs[0]+"; "+inputs[1]);
    		if (inputs.length == 1 && inputs[0].length() > 2) {
    			outList.add("Error! Single input must be less than 100!");
    			return outList;
    		}
    		else if (inputs.length == 2 && inputs[0].trim().length() > 2) {
    			outList.add("Error! First input must be less than 100!");
    			return outList;
    		}
    		else if (inputs.length == 2 && inputs[1].trim().length() > 2) {
    			outList.add("Error! Second input must be less than 100!");
    			return outList;
    		}
    		else {
		    	digits = digits.replaceAll(",", "")
		    				.replaceAll(" ", "")
		    				.replaceAll("0", "")
		    				.replaceAll("1", "");
			    String combo = "";
			    recursiveCombine(digits, outList, combo);
			    return outList;
    		}
    	}
    }
    
    protected static void recursiveCombine(String next_digits, List<String> outList, String combo) {
        if (next_digits.length() == 0) {
            outList.add(combo);
        } else {
            String digit = next_digits.substring(0, 1);
        	String letters = map.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = letters.substring(i, i + 1);
                recursiveCombine(next_digits.substring(1), outList, combo + letter);
            }
        }
    }
}
