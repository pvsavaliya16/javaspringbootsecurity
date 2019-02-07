package parth;


class StringBuilderExample {
	public static void main(String[] args) {
		
		// Constructors
		String str = "Hello";
		StringBuilder builder = new StringBuilder(20); //creates builder with size passed in an argument
		StringBuilder builder2 = new StringBuilder(str);	// creates builder with additional room of 16 characters then length of string passed in an argument	
		
		//methods

		System.out.println(builder2.length()); //returns length of content of string //which is 5
		System.out.println(builder2.capacity()); //returns total room for charactes stored in builder // so 16+5 = 21
		System.out.println(builder.capacity()); //20 because we specified length
		System.out.println(builder.length()); //0 because empty
		builder2.setCharAt(4, 'l'); //replaced character at specified index
		System.out.println(builder2);
		builder2.setCharAt(4, 'o');
		String s = builder2.append(" World").toString(); // appends string to end of character
		System.out.println(s);

		builder2.insert(5, " good"); // inserts specific string or any other object at given index
		System.out.println(builder2);

		builder2.reverse(); //reverses the content of builder
		System.out.println(builder2); 
		builder2.reverse();

		builder2.delete(5, 7); //deletes the sequence of chars between start and end indices
		System.out.println(builder2);

		builder2.deleteCharAt(5); //deletes char at specified location
		System.out.println(builder2);

		builder2.replace(0, 5, "HELLO "); //replaces string at location between start and end index
		System.out.println(builder2);

		String s1 = builder2.substring(5); //returns string of chars after given index from builder
		String s2 = builder2.substring(5, 10); // returns string of chars between start and end indices
		System.out.println(s1);
		System.out.println(s2);

	}	
}