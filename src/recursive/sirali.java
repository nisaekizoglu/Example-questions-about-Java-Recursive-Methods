package recursive;

public class sirali {
	public static void main(String[] args) {
		int[] x = { 1, 3, 16, 22, 23 };
		boolean t = siralimi(x, 0, true);
		if (t) {
			System.out.println("sirali");
		} else {
			System.out.println("sirasiz");
		}
	}

	public static boolean siralimi(int[] a, int i, boolean b) {
		if (i >= a.length - 1) {
			return true;
		} else if (a[i] < a[i + 1]) {
			return siralimi(a, i + 1, true);
		} else {
			return false;
		}
	}
}
