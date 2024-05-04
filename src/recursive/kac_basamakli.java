package recursive;

public class kac_basamakli {
	public static void main (String [] args) {
		int sayi= basamak(476);
		 System.out.println("Sayının basamak sayısı: " + sayi);
	}
	public static int basamak(int n) {
		if(n<=9 && n >=0) {
			return 1;
		}else {
			return 1+basamak(n/10);
		}
		
	}

}
