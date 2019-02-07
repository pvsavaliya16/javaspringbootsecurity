class Circle {
	int radius;
	Circle(int radius) {
		this.radius = radius;
	}
	void calculateArea() {
		this.area(this.radius);
	}
	void area(int radius){
		System.out.println(radius*radius*3.141);
	}
}
class UseOfThis2 {
	public static void main(String[] args) {
		Circle c = new Circle(20);
		c.calculateArea();
	}
}