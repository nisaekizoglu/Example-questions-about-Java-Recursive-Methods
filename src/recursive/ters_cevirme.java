package recursive;

public class ters_cevirme {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5 };
		int[] y = new int[5];
		y = ters(x, 0);
		for (int i = 0; i < 5; i++) {
			System.out.println(y[i]);
		}
	}

	public static int[] ters(int[] a, int i) {
		if (i > (a.length) / 2) {
			return a;
		} else {
			int temp;
			temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
			return ters(a, i + 1);
		}
	}
}
