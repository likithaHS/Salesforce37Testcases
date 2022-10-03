package Teckarch.Day9;

import java.util.HashMap;
import java.util.Map;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Character,Integer> charCountMap = new HashMap<>();
		String str ="hello";
		char[] strArray = str.toCharArray();
		for (char c:strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c,charCountMap.get(c)+1);
				
			}else
			{
				charCountMap.put(c, 1);
			}
			
		}
		for (Map.Entry entry :charCountMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
