package recursive;

//sayının pozitif tam sayıya kadar olan kısmını toplayan recursive metod
public class pozitifToplam {
	public static void main(String[] args) {
		int sayi = -4;
		int y = toplama(sayi);
		System.out.println("Sayinin pozitif olan kismina kadar toplami: " + y);
	}

	public static int toplama(int a) {
		if (a == 0) {
			return 0;
		} else if (a < 0) {
			a = -a;
			return a + toplama(a - 1);
		} else
			return a + toplama(a - 1);
	}

}
