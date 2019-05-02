package returnMethod;

import java.util.Arrays;

public class Anagram2 {
public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "Silent";           
		System.out.println(isAnagram(str1, str2));
	}
	public static boolean isAnagram (String str1, String str2) {
		boolean isAnagram = false;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() != str2.length()) {
			return isAnagram;
		}
			char[] charred1 = str1.toCharArray();
			char[] charred2 = str1.toCharArray();
		
			Arrays.sort(charred1);
			Arrays.sort(charred2);
		for (int i = 0; i < charred2.length; i++) {
			if (charred1[i] == charred2[i]) {
				isAnagram = true;
			}
		}
		return isAnagram;
	}
	}