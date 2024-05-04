package recursive;
//kendisine parametre olarak gelen int dizisindeki en büyük indisi geri döndüren recursive fonksiyon
public class enbuyukeleman {
	public static void main (String [] args) {
		int [] x= {1,3,16,2,9};
		int y = enbbul (x,x[0],0,0);
		System.out.println(y);
	}
	public static int enbbul (int [] a, int enb, int ind, int s) {
		if (ind >= a.length) {
			return s;
		}else if (enb < a[ind]) {
			return enbbul(a, a[ind],ind+1,ind);
		}else {
			return enbbul(a,enb,ind+1,s);
		}
	}

}
