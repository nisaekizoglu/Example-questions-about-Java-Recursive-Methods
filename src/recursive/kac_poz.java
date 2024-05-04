package recursive;

public class kac_poz {
	public static void main(String[] args) {
		int[] x = { -1, 2, 3, 4, 5 };
		int y = pozitif(x,0);
		System.out.println(y);
	}
	public static int pozitif(int a [], int i) {
		if (i > a.length-1) {
			return 0;
		}else if (a[i] > 0) {
			return 1+ pozitif(a,i+1);
			
		}else {
			return pozitif(a,i+1);
		}
	}

}
