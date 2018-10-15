import java.util.LinkedHashMap;

public class RomanNumerals {
	public int convertToInteger(String romanNum) throws Exception {
		
		String[] num = romanNum.toUpperCase().split("");
		int sum = 0;
		
		if(!checkLegal(romanNum))
			throw new Exception("Illegal numeral");
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("M", 1000);
	//	map.put("CM", 900);
		map.put("D", 500);
	//	map.put("CD", 400);
		map.put("C", 100);
	//	map.put("XC", 90);
		map.put("L", 50);
	//	map.put("XL", 40);
		map.put("X", 10);
	//	map.put("IX", 9);
		map.put("V", 5);
	//	map.put("IV", 4);
		map.put("I", 1);
		
		for (int i=0; i<num.length - 1; i++) {
			if (map.get(num[i]) < map.get(num[i+1])) 
				sum -= map.get(num[i]);
			else
				sum += map.get(num[i]); 
				
		}
		sum += map.get(num[(num.length -1)]) ;
		return sum;
		
		
		
	}
	
	//Check for non Roman numeral and repetition
	public boolean checkLegal(String romanNum) {
		if (romanNum == "")
			return false;
		if (!romanNum.matches("[IVXLCDM]+"))
			return false;
		if (romanNum.contains("IIII") || romanNum.contains("CCCC") || romanNum.contains("XXXX") || romanNum.contains("MMMM"))
			return false;
		if (romanNum.contains("VV") || romanNum.contains("LL") || romanNum.contains("DD"))
			return false;	
		if (romanNum.contains("VD") || romanNum.contains("VL") || romanNum.contains("LD"))
			return false;	
		return true;
	}
}
