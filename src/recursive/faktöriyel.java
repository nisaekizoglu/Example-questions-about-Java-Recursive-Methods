package recursive;

public class faktöriyel {
	public static void main (String [] args) {
		int sayi= 4;
		int y = faktoriyelHesaplama(sayi);
		System.out.println("Sayinin faktoriyeli: " +y);
		
	}
	public static int faktoriyelHesaplama(int a) {
		if(a == 1) {
			return 1;
		}else {
			return a * faktoriyelHesaplama(a-1);
		}
	}

}
