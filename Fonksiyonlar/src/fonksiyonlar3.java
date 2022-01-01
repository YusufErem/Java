import java.util.Scanner;
public class fonksiyonlar3 {
public static int fib(int n) {
		if(n==0) return 1;
		if(n==1) return 1;
		return fib(n-1)+fib(n-2);
		
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("fibonacci serisnde lüfen kaçýncý terimi bulmak istedðinizi yazýnýz: ");
		 int  terim;
		 terim = input.nextInt();
		 System.out.println("yazdýðýnz terimin fibonacci serisindeki karþýlýðý: "+ fib(terim));
		
		
		
	}

}
