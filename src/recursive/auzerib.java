package recursive;
//kendisine parametre olarak gelen a ve b sayılarıyla a üzeri b fonksiyonu hesaplayan recursive.
public class auzerib {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int y = auzeribfonk(a,b);
		System.out.println("a uzeri b: " +y);
		
	}
	public static int auzeribfonk(int sayi1, int sayi2) {
		if(sayi2 == 0 || sayi1 == 0) {
			return 1;
		
		}else {
			return sayi1* auzeribfonk(sayi1, sayi2-1);
		}
		
	}

}
