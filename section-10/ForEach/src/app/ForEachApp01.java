package app;

public class ForEachApp01 {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);

		}
		
		// Now, using for each structure
		for(String obj: vect) {
			System.out.println(obj);
		}
		
		// They are equivalent
	}

}
