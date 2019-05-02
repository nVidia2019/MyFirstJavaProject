package nestedLoop;

public class HarshSeason {
public static void main(String[] args) {
	int[] arr = {0, -10, 3, 28, -41, 0, 3, -5, 10, -13, 1, 15};
	System.out.println(hardestSeason(arr));
}
public static String hardestSeason (int[] arr) {
	int [] winter = new int[arr.length/4];
	int [] spring = new int[arr.length/4];
	int [] summer = new int[arr.length/4];
	int [] autumn = new int[arr.length/4];
/////
	for (int i = 0; i < arr.length/4; i++) {
		winter[i] = arr[i];
	}
	int hWinter = 0;
	int lWinter = 0;
	int winterDif = 0;
	for (int i = 0; i < winter.length; i++) {
		if (winter[i] >= hWinter) {
			hWinter = winter[i];
		}
		if (winter[i] <= lWinter) {
			lWinter = winter[i];
		}
	}
	winterDif = hWinter-lWinter;
	System.out.println(winterDif);
/////
	for (int i = arr.length/4; i < arr.length/2; i++) {
		int j = 0;
		spring[j] = arr[i];
		System.out.println(spring[j]);
		j++;
	}
	int hSpring = 0;
	int lSpring = 0;
	int springDif = 0;
	for (int i = 0; i < spring.length; i++) {
		if (spring[i] >= hSpring) {
		hSpring = spring[i];
		}
		if (spring[i] <= lSpring) {
		lSpring = spring[i];
		}
	}
	System.out.println(hSpring);
	System.out.println(lSpring);
	springDif = hSpring-lSpring;
	System.out.println(springDif);
/////
	for (int i = arr.length/2; i < arr.length/4*3; i++) {
		int j = 0;
		summer[j] = arr[i];
		j++;
	}
	int hSummer = 0;
	int lSummer = 0;
	int summerDif = 0;
	for (int i = 0; i < summer.length; i++) {
		if (summer[i] >= hSummer) {
			hSummer = summer[i];
		}
		if (summer[i] <= lSummer) {
			lSummer = summer[i];
		}
		}
		summerDif = hSummer-lSummer;
	System.out.println(summerDif);
//////
		for (int i = arr.length/4*3; i < arr.length; i++) {
			int j = 0;
			autumn[j] = arr[i];
			j++;
		}
		int hAutumn = 0;
		int lAutumn = 0;
		int autumnDif = 0;
		for (int i = 0; i < autumn.length; i++) {
			if (autumn[i] >= hAutumn) {
				hAutumn = autumn[i];
			}
			if (autumn[i] <= lAutumn) {
				lAutumn = autumn[i];
			}
			}
			autumnDif = hAutumn-lAutumn;
	System.out.println(autumnDif);
////		
	if (winterDif > springDif && winterDif > summerDif && winterDif > autumnDif) {
		return "winter";
	}
	if (springDif > winterDif && springDif > summerDif && springDif > autumnDif) {
		return "spring";
	}
	if (summerDif > winterDif && summerDif > springDif && summerDif > autumnDif) {
		return "summer";
	}
	if (autumnDif > winterDif && autumnDif > springDif && autumnDif > summerDif) {
		return "autumn";
	}else {
		return "There is more than one season with the largest temperature difference.";
	}
	
}
}
