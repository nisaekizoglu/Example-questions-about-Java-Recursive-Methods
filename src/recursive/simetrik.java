package recursive;

public class simetrik {
	public static void main(String[] args) {
		int [] x = {1,1,1,1};
		int t = simetrikmi(x,0,1);
		if(t==1) {
			System.out.println("simetrik");
		}else {
			System.out.println("degil");
		}
	}
	public static int simetrikmi(int []a, int i,int b) {
		if(i >= (a.length-1)/2) {
			return 1;
			
		}else if (a[i] == a[a.length-1-i]) {
			return simetrikmi(a, i+1, 1);
			
		}else {
			return -1;
	}
	}
}
