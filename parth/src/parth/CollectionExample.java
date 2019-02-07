
import java.io.*;
import java.util.*;

class Employee {
	private int id;
	private String name;
	private Designation designation;

	Employee(int id, String name, Designation designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	Employee(int id, String name, Designation designation, int salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.designation.setSalary(salary);	
	}

	public String toString() {
		return "ID = " + this.id + "\nNAME = " + this.name + this.designation;
	}

	public Designation getDesignation() {
		return this.designation;
	}
}

class Designation {
	private String des_name;
	private int salary;

	Designation(String des_name, int salary) {
		this.des_name = des_name;
		this.salary = salary;
	}

	Designation(String des_name) {
		this.des_name = des_name;
		this.salary = 0;
	}

	public String getDesName() {
		return this.des_name;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "\nDESIGNATION = " + this.des_name + "\nSALARY = " + this.salary + "\n";
	}
}

class CollectionExample {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Map<String, Integer[]> hm = new HashMap<String, Integer[]>();

		Designation projectManager = new Designation("Project manager");
		Designation teamLeader = new Designation("Team Leader");
		Designation teamMember = new Designation("Team member");
		Designation ceo = new Designation("CEO");

		employees.add(new Employee(1, "Parth", ceo, 7000));
		employees.add(new Employee(2, "Vaibhav", teamLeader, 5500));
		employees.add(new Employee(3, "Gopen", teamLeader, 5000));
		employees.add(new Employee(4, "Jijil", projectManager, 6000));
		employees.add(new Employee(5, "Akash", projectManager, 6500));
		employees.add(new Employee(6, "Kaushal", teamMember, 4000));
		employees.add(new Employee(7, "Smit", teamMember, 4100));
		employees.add(new Employee(8, "Rajan", teamMember, 4200));
		employees.add(new Employee(9, "Nisharg", projectManager, 6200));
		employees.add(new Employee(10, "Mohit", teamMember, 4300));
		employees.add(new Employee(11, "Jay", teamMember, 4400));

		Iterator iterator = employees.iterator();

		System.out.println("Employees: \n");

		while(iterator.hasNext()) {
			Employee emp = (Employee)iterator.next();
			Designation d = emp.getDesignation();
			String desName = d.getDesName();
			int salary = d.getSalary();
			System.out.println(emp);
			if (!hm.containsKey(desName)) {
				hm.put(desName, new Integer[]{salary, 1});
			} else {
				hm.put(desName, new Integer[]{ (hm.get(desName)[0] + salary), hm.get(desName)[1] + 1});
			}
		}

		int teamLeaderTotal = hm.get(teamLeader.getDesName())[0];
		int projectManagerTotal = hm.get(projectManager.getDesName())[0];
		int teamMemberTotal = hm.get(teamMember.getDesName())[0];
		int ceoTotal = hm.get(ceo.getDesName())[0];

		int teamLeaderCount = hm.get(teamLeader.getDesName())[1];
		int projectManagerCount = hm.get(projectManager.getDesName())[1];
		int teamMemberCount = hm.get(teamMember.getDesName())[1];
		int ceoCount = hm.get(ceo.getDesName())[1];

		System.out.println("Total CEOs = " + ceoCount + "  Total Salary = " + ceoTotal);
		System.out.println("Total team leaders = " + teamLeaderCount + "  Total Salary = " + teamLeaderTotal);
		System.out.println("Total team members = " + teamMemberCount + "  Total Salary = " + teamMemberTotal);
		System.out.println("Total project managers = " + projectManagerCount + "  Total Salary = " + projectManagerTotal);
	}
}

