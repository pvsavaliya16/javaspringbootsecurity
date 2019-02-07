package parth;

class A {
	int a;
	A(int a){
		this.a = a;
	}
}
class B extends A {
	int b;
	B(int b){
		this.b = b;
	}
}
class ObjectSlicing {
	public static void main(String[] args) {
		B bb = new B(10);
		A aa = b;
		System.out.println(aa.b);
	}
}