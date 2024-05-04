package recursive;
//kendisine parametre olarak gelen dizide istedğimiz eleman var mı yok mu bulan recursive fonk.
public class varmiyokmu {
	public static void main (String [] args) {
		int [] x = {6,8,-1,9,3};
		int y = bul(x,0,9);
		System.out.println(y);
	}
	public static int bul(int []n, int i, int ara) {
		if (i == n.length) {
			return -1;
		}else if (n[i] == ara) {
			return i;
		}else {
			return bul(n,i+1,ara);
		}
	}

}
