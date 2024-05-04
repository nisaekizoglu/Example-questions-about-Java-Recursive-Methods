package recursive;

public class isim_yaz {
	public static void main (String [] args) {
		yaz(4);
	}
	public static void yaz(int n) {
		if (n>0) {
			System.out.println("Nisa");
			yaz(n-1);
		}
	}

}
