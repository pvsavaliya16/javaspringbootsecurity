package parth;

import java.util.Scanner;
import java.io.IOException;

class ChainedExceptionExample {
	public static void main(String[] args) {
		try {	
			ArithmeticException aex = new ArithmeticException("ArithmaticException called for unknown reason");
			Scanner s = new Scanner(System.in);
			int x = s.nextInt();
			int y = s.nextInt();
			if (y == 0) {
				aex.initCause(new IOException("You entered 0 as divisor"));
				throw aex;
			} else {
				System.out.println(x/y);
			}
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println(ae.getCause());
		}
	}	
}