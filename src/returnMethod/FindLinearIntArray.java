package returnMethod;

import java.util.Arrays;

public class FindLinearIntArray {
public static void main(String[] args) {
	int[] arr1 = {2,3,4,5,5};
	int[] arr2 = {4,5};
	System.out.println(linearArr(arr1, arr2));	
}
//public static boolean linearArr (int[] outer, int[] inner) {
//	  int numFound = 0;
//	  int k = 0;
//	  for(int i = 0; i < outer.length; i++) {
//	     if(outer[i] == inner[k]) {
//	        numFound++;
//	        k++;
//	     } else if(outer[i] > inner[k]) {
//	        return false;
//	     }
//	    
//	     if(numFound == inner.length)
//	        return true;
//	  }
//	     
//	  return false;
//	}

public static boolean linearArr(int[] outer, int[] inner){
		boolean notFound;
		for(int inI = 0, outI = 0; inI < inner.length; inI++){
				notFound = true;
			for(; outI < outer.length && notFound; outI++){
				if(inner[inI] == outer[outI])
					notFound = false;
				}
			if(notFound)
				return false;
			}
		return true;
}
}
