
package parth;

class StringExample {
	public static void main(String[] args) {

		//methods to create String object

		String name1 = "Parth";
		String name2 = new String("Parth");

		System.out.println(name1 == name2); //false because of different refference objects
		System.out.println(name1.equals(name1)); //true because equals compares value

		System.out.println();

		String name3 = "Parth";

		System.out.println(name1 == name3);  // true because they refer to same object in stringpool

		System.out.println();

		//Constructors

		char[] chars1 = {'p','a','r','t','h'} ;
		String charArray1 = new String(chars1); 
		System.out.println("String created with Character array = " + charArray1);

		char[] chars2 = {'p','a','r','t','h','s','a','v','a','l','i','y','a'} ;

		String charArray2 = new String(chars2, 3, 4); //2nd arg defines start index and 3rd arg defines no of chars
		System.out.println("String created with desired no. of Characters from array = " + charArray2);

		System.out.println();

		byte[] values1 = {97, 98, 99, 100, 101, 102 };
		String byteArray1 = new String(values1);
		System.out.println("String created with Byte array  = " +  byteArray1);
		byte[] values2 = {97, 98, 99, 100, 101, 102, 65, 66, 67, 68, 69, 70 };
		String byteArray2 = new String(values2); //2nd arg defines start index and 3rd arg defines no of chars
		System.out.println("String created with desired Bytes from array  = " +  byteArray2);

		String str = new String(name2); // String created with another String object
		System.out.println("String created with another String object = " + str);

		// String Concatination

		String str2 = name1 + " " + name2;
		System.out.println("String concatinated = " + str2);

		//Methods of string class

		System.out.println(str2.length()); //prints length of string 
		System.out.println(str2.charAt(7)); // returns character at specified index
		
		char[] stringToArray = str2.toCharArray(); //returns character array of all characters of string
		System.out.println(stringToArray);

		//	equals method is applied earlier
		
		System.out.println("Parth".equalsIgnoreCase("paRth")); //prints true because this method ignores case

		System.out.println("parthvsavaliya".substring(4)); //single arg defines start index

		System.out.println("parthvsavaliya".substring(4, 8)); // substring(startindex, endindex) exclusive of endindex

		System.out.println("    Parth Savaliya       ".trim()); // trims white spaces

		System.out.println("parth".toUpperCase()); // converts each character to uppercase

		System.out.println("ParTh".toLowerCase()); // converts each character to lowercase

		String sentence = "I completed some basic java concepts today";
		String[] words =  sentence.split(" "); //splits and stores the pieces in string array based on given token(or char)
		for(String s: words) {
                    System.out.println(s);
                }
        }
}