package icc;

public class Primo {

	public static void main(String[] args) {
		int n = 524287;
		for (int d = n-1; d > 1; d--) {
			int r = n%d;
			if (r == 0) {
				System.out.println(n + " não é primo");
				System.exit(0);
			}
		}
		System.out.println(n + " é primo");
	}

}
