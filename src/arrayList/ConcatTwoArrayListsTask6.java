package arrayList;

import java.util.*;

public class ConcatTwoArrayListsTask6 {
public static void main(String[] args) {
	ArrayList<String> wordList1 = new ArrayList<>();
	wordList1.add("a");
	wordList1.add("b");
	wordList1.add("c");
	wordList1.add("d");
	ArrayList<String> wordList2 = new ArrayList<>();
	wordList1.add("e");
	wordList1.add("f");
	wordList1.add("g");

	System.out.println(ConcatTwoArraLists(wordList1, wordList2));
	
}
public static ArrayList<String> ConcatTwoArraLists (ArrayList<String> wordList1, ArrayList<String> wordList2){
	ArrayList<String> wordList3 = new ArrayList<>();
	wordList3.addAll(wordList1);
	wordList3.addAll(wordList2);
	return wordList3;
}

}
