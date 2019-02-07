package parth;


class StringBufferExample {
	public static void main(String[] args) {
		
		// Constructors
		String str = "Parth";
		StringBuffer buffer = new StringBuffer(20); //creates buffer with size passed in an argument
		StringBuffer buffer2 = new StringBuffer(str);	// creates buffer with additional room of 16 characters then length of string passed in an argument	
		
		//methods

		System.out.println(buffer2.length()); //returns length of content of string //which is 5
		System.out.println(buffer2.capacity()); //returns total room for charactes stored in buffer // so 16+5 = 21
		System.out.println(buffer.capacity()); //20 because we specified length
		System.out.println(buffer.length()); //0 because empty
		buffer2.setCharAt(4, 't'); //replaced character at specified index
		System.out.println(buffer2);
		buffer2.setCharAt(4, 'h');
		String s = buffer2.append(" Savaliya").toString(); // appends string to end of character
		System.out.println(s);

		buffer2.insert(5, " V"); // inserts specific string or any other object at given index
		System.out.println(buffer2);

		buffer2.reverse(); //reverses the content of buffer
		System.out.println(buffer2); 
		buffer2.reverse();

		buffer2.delete(5, 7); //deletes the sequence of chars between start and end indices
		System.out.println(buffer2);

		buffer2.deleteCharAt(5); //deletes char at specified location
		System.out.println(buffer2);

		buffer2.replace(0, 5, "PARTH "); //replaces string at location between start and end index
		System.out.println(buffer2);

		String s1 = buffer2.substring(5); //returns string of chars after given index from buffer
		String s2 = buffer2.substring(5, 10); // returns string of chars between start and end indices
		System.out.println(s1);
		System.out.println(s2);

	}	
}