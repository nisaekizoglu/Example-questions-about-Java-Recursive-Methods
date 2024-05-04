package recursive;

public class ter1 {
	public static void main(String[] args) {
		String isim = "nisa";
		String b = "";
		String s1 = ters(isim, 0, b);
		System.out.println(s1);

	}

	public static String ters(String str, int i, String bos) {
		if (i > str.length() - 1) {
			return bos;
		} else
			bos = str.charAt(i) + bos;
		return ters(str, i + 1, bos);

	}

}
