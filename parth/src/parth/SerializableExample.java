
// package parth;

import java.io.*;

class Employee implements Serializable {
	int id;
	String name;
	int salary;
	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return "ID = " + this.id + "\nName = " + this.name + "\nSalary = " + this.salary;
	} 
}


class SerializableExample {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Parth", 40000);
		String fname = "demo.txt";

		try {
			FileOutputStream fos = new FileOutputStream(fname);
			ObjectOutputStream ostream = new ObjectOutputStream(fos);
			System.out.println(emp);
			ostream.writeObject(emp);
			ostream.close();
			fos.close();
			System.out.println("Object emp serialised!!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		Employee emp2 = null;

		try {
			FileInputStream fis = new FileInputStream(fname);
			ObjectInputStream istream = new ObjectInputStream(fis);
			emp2 = (Employee)istream.readObject();
			System.out.println(emp2);
			fis.close();
			istream.close();
			System.out.println("Object deserialized!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}	
}