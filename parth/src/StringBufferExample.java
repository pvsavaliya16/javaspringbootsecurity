
class StringBufferExample {
	public static void main(String[] args) {
		
		// Constructors
		String str = "Parth";
		StringBuffer buffer = new StringBuffer(20); //creates buffer with size passed in an argument
		StringBuffer buffer2 = new StringBuffer(str);	// creates buffer with additional room of 16 characters then length of string passed in an argument	
		
		//methods

		System.out.println(buffer2.length()); //returns length of content of string //which is 5
		System.out.println(buffer2.capacity()); //returns total room for charactes stored in buffer // so 16+5 = 21
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());

	}	
}