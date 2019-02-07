
import java.io.*;
import java.util.*;



class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();	
		HashSet<String> set2 = new HashSet<String>();	
		set.add("Abc");
		set.add("def");
		set.add("ghi");
		set.add("jkl");
		set.add("mno");
		set.add("pqr");
		set.add("stu");
		set.add("vwx");
		set.add("yz");
		
		set2.add("Abc");
		set2.add("def");
		set2.add("ghi");
		set2.add("jkl");
		set2.add("mno");
		set2.add("pqr");
		set2.add("stu");
		set2.add("vwx");
		set2.add("yz");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		Iterator<String> it2 = set2.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}	
}