package recursive;

public class fibonacci {
	public static void main (String [] args) {

		int y = fib(2,1,1,10);
		System.out.println(y);
		}
	public static int fib(int n, int ilk,int iki, int son) {
		if(n == 1 || n == 0) {
			return 1;
		}else if(n == son){
			return iki;
		}else {
			return fib(n+1, iki, ilk+iki,son);
		}
		
	}

}
