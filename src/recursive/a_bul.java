package recursive;

public class a_bul {
	//kendisine parametre olarak gelen stringde kaç tane a harfi olduğunu döndüren kodu yazınız.
	public static void main (String [] args) {
		String s = "nisa";
		int x = abul(s,0,0);
		System.out.println(x);
	}
	public static int abul(String str, int t, int ind) {
		if(ind > str.length()-1) {
			return t;
		}else if (str.charAt(ind) == 'a') {
			return abul(str,t+1,ind+1);
		}else {
			return abul (str,t,ind+1);
		}
	}
}

