package factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		BigInteger factorial = scn.nextBigInteger();
		scn.close();
		BigInteger n = new BigInteger("1");

		while(factorial.compareTo(BigInteger.ONE) == 1) {
			n = n.add(BigInteger.ONE);
			factorial = factorial.divide(n);
		}

		System.out.println(n);

	}

}
