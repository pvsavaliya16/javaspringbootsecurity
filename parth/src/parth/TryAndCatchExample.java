class TryAndCatchExample {
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			for (int i=0; i<6; i++) {
				arr[i] = i;			
			}
		} catch(Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			System.out.println("Exception successfully caught");
		}		
	}
}