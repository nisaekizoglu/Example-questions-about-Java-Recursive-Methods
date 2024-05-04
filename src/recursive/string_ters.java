package recursive;

//kendisine parametre olarak gelen stringi ters ceviren recursive fonksiyonu yazınız
public class string_ters {
	public static void main(String[] args) {
		String isim = "nisa";
		String s1 = ters(isim, 0);
		System.out.println(s1);

	}

	public static String ters(String str, int i) {
		if (i > str.length() - 1) {
			return "";
		} else
			return ters(str, i + 1) + str.charAt(i);

	}

}
