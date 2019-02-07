class Car {
	int speed;
	String name;
	String color;
	Car(int speed, String name, String color) {
		this.speed = speed;
		this.name = name;
		this.color = color;
	}
	void displayCar() {
		System.out.println("Name: " + name + "  Speed: " + speed + "  Color: " + color + "  !!!");
	}
}


class UseOfThis1 {
	public static void main(String[] args) {
		Car c = new Car(120, "i10", "Black");
		c.displayCar();
	}
}