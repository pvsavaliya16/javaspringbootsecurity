class PrivateConst {
	int x;
	private PrivateConst(int x) {
		this.x = x;
	}
	static PrivateConst createConstructor(int x) {
		return new PrivateConst(x);
	} 
	void displayX() {
		System.out.println("X = " + x);
	}
	public static void main(String[] args) {
		PrivateConst pct = PrivateConst.createConstructor(20);
		pct.displayX();
	}
}
