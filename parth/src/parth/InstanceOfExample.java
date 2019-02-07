class Parent {}

class Child extends Parent {}


class InstanceOfExample {
	public static void main(String[] args) {
		Child c1 = new Child();
		Parent p1 = new Parent();
		Parent p2 = new Child();
		System.out.println();


		if (c1 instanceof Child) {
			System.out.println("c1 is instanceof Child");
		} else {
			System.out.println("c1 is not instanceof Child");
		} 
		System.out.println();


		if (p1 instanceof Parent) {
			System.out.println("p1 is instanceof Parent");
		} else {
			System.out.println("p1 is not instanceof Parent");
		}
		System.out.println();


		if (c1 instanceof Parent) {
			System.out.println("c1 is instanceof Parent");
		} else {
			System.out.println("c1 is not instanceof Parent");
		}
		System.out.println();

		if (p1 instanceof Child) {
			System.out.println("p1 is instanceof Child");
		} else {
			System.out.println("p1 is not instanceof Child");
		}
		System.out.println();


		if (p2 instanceof Child) {
			System.out.println("p2 is instanceof Child");
		} else {
			System.out.println("p2 is not instanceof Child");
		}
		System.out.println();
		

		if (p2 instanceof Parent) {
			System.out.println("p2 is instanceof Parent");
		} else {
			System.out.println("p2 is not instanceof Parent");
		}
	}
}