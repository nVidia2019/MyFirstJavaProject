package stringManipulation;

public class DigitWatchTimeIntoSeconds {
public static void main(String[] args) {
	String time = "00:20:03"; 
	System.out.println(digitWatchToSeconds(time));
}
public static int digitWatchToSeconds (String watch) {
	String[] watchArr = watch.split(":"); //          <==== turn String into String array
	int [] watchIntArr = new int [watchArr.length];// <==== declare int[]  
	for (int i = 0; i < watchIntArr.length; i++) {//  <==== assign int value from String[]
		watchIntArr[i] = Integer.valueOf(watchArr[i]);
	}
	int sumSeconds = watchIntArr[0]*60*60 + watchIntArr[1]*60 + watchIntArr[2];// <=== turn hours, min into sec
	return sumSeconds;
}
}  