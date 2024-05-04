package recursive;

public class kucukKarakter {
	public static void main (String [] args) {
		String s = "nisaNarD";
		int x = kucuk(s,0);
		System.out.println(x);
	}
	public static int kucuk(String str, int i) {
		if(i == str.length()) {
			return 0;
		}
		char karakter = str.charAt(i);
		if (karakter <= 'z' && karakter >= 'a') {
			return 1+kucuk(str,i+1);
		}else {
			return kucuk(str,i+1);
		}
	}

}
