
import java.util.*;
import java.io.*;

class Employee {
	int id;
	String name, designation;
	Employee(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	public String toString() {
		return "ID = " + this.id + "\nNAME = " + this.name + "\nDESIGNATION = " + this.designation + "\n";
	}
}

class SortByName implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}

}

class ComparatorExample {
	public static void main(String[] args) {
		ArrayList<Employee> ar = new ArrayList<Employee>(); 
        ar.add(new Employee(111, "Parth", "programmer analyst")); 
        ar.add(new Employee(131, "Akash", "Team leader")); 
        ar.add(new Employee(122, "Vaibhav", "CEO")); 
        ar.add(new Employee(113, "Gopen", "programmer analyst")); 
        ar.add(new Employee(134, "Rajan", "Team leader")); 
        ar.add(new Employee(125, "Jijil", "CEO"));

        System.out.println("Unsorted List...!!");

        for (Employee e : ar) {
        	System.out.println(e);
        }

        Collections.sort(ar, new SortByName());

        System.out.println("Sorted List...!!\n");

        for (Employee e : ar) {
        	System.out.println(e);
        }
	}
}