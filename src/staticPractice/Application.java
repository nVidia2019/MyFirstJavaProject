package staticPractice;

public class Application {
public static void main(String[] args) {
	AppUser user1 = new AppUser("ironman", "John Smith", "123");
	System.out.println(user1.getCount());
	
	AppUser user2 = new AppUser("ironwoman", "John Jackson", "456");
	AppUser user3 = new AppUser("superwoman", "Peter Parker", "789");
	
	user1.setCount(100);
	System.out.println(user2.getCount());
	System.out.println(user3.getCount());
	
	AppUser user4 = new AppUser();
	System.out.println(user4.getCount());
	
	System.out.println(user1.getUserId());
}
}
