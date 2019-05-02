package returnMethod;

public class SignFunction {
public static void main(String[] args) {
	signFunc(-9);
}

public static void signFunc(int num) {
	if (num > 0) {
		System.out.println("1");
	}else if (num < 0) {
		System.out.println("-1");
	}else if (num == 0) {
		System.out.println("0");
	}
}
}
