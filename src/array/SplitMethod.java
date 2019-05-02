package array;

public class SplitMethod {
public static void main(String[] args) {
	String words = "java-selenium-cucumber-testing-junit-eclipse-maven-git-github";
	String[] splitWords = words.split("-");
	System.out.println(splitWords.length);
	System.out.println(splitWords[0]);
	
	for(String newWord: splitWords) {
		System.out.println(newWord);
	}
}
}
