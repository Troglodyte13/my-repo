

public class Program {
	

	public static void main(String[] args) {
		int x = 4;
		int y = 5;
		int z = 18;
		
//		for (int f = 0; f <= 256; f++) {
//			System.out.println( f + " " + (char)f);
//		}
//		
//		char letter = 'A'; // Character is actually an int
//		// ASCII -- ISO-8995 || Only applies to English Characters
//		// UTF-8 -- Unicode || { Support multiple languages }
//		char m = '\u0065';
//		
//		
//		
//		if (letter == 65) {
//			System.out.println("This an uppercase \u0065");
//		}
//		
		
		String dog = "Bulldog";
		String dog2 = "Beagle";
		String dog3 = "beagle";
		
		// if (condition) { body } else if (condition) { body } else { }
		// String.equals() for String equality check
		// || or, && and
		
		// If x >= 1 set z = x + y else set z = 0
		
		// int var = ( x >=1 ) ? {true} : {false}
//		z = (x >= 1) ? x + y : 0;
//		
//		if (x >= 1) {
//			z = x + y;
//		}
//		else {
//			z = 0;
//		}
//		
		
//		if (dog2.equals(dog3)){
//			System.out.println("Same dog");
//		}

//		if ((y == 5 ) && (x == 3 || x == 5)) {
//			
//		}
		
		// switch { case statement } char / int 
		// switch (x) { case: , default: }
		// once program hits break; it exits the switch statement
		
		switch (x) {
			case 5:
				System.out.println("x is 5");
				break;
			case 4:
				System.out.println("4 ran");
				//break;
			case 3:
				System.out.println("3 ran");
				break;
			case 2:
				System.out.println("x is 2,3, or 4");
				break;
			case 1:
				System.out.println("x is 1");
				break;
				default:
					System.out.println("no clue what x is");
					
		}
 		
		

	}

	// functions / methods
	// function / method / header signature
	
	// access modifiers { private, public, protected final, static }
	// private only accessible in it's scope
	// public accessible everywhere
	// protected publicly accessible only in its package
	// final = const
	
	// Compiler signature view
	// public static void checking(String)
	public static void checking(String n) { }
	// public static void checking(String, String)
	public static void checking(String n, String x) { }
	// public static void checking(String, int)
	public static void checking(String n, int x) {}
	public static void checking(int x, String n) {
		if (x == 3) { return; }		
	}
	
	// String x = fullName("Damon", "Drake");
	// SELECT * FROM Users WHERE LastName LIKE 'd%'
	public static String fullName(String fn, String ln) {
		if (ln.startsWith("D")) { return ""; }
		
		return String.format("%s %s", fn, ln);
	}
}
