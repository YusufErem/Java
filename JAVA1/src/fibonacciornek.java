
public class fibonacciornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b =1 ;
		System.out.println(a+ "\n" + b);

		int c ;
		for(int i=1;i<12;i++) {
			
			c =a +b ;
			a =b;
			b=c;
		System.out.println(c);
		}
		
		
	}

}
