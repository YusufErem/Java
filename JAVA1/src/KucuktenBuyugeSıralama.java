import java.util.Scanner;
public class KucuktenBuyugeS�ralama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int a, b, c ;
		
	
		System.out.print("L�tfen a say�y� giriniz: ");
		a = input.nextInt();
		System.out.print("L�tfen b say�y� giriniz: ");
		b = input.nextInt();
		System.out.print("L�tfen c say�y� giriniz: ");
		c = input.nextInt();
		
		
		if((a>b) && (b>c)) {		
			System.out.println("a > b > c");
		}
		
		else if ((a>b) && (c>b && c<a) ) {
			System.out.println("a > c > b");
		
		}
		else if ((b>a)&&(a>c)){
			System.out.println("b > a > c");
			
		}
		else if ((b>a)&& (c>a && c<b)) {
			System.out.println("b > c > a");
		}
	
		else if ((c>a)&&(a>b)) {
			System.out.println("c > a > b");
			
		}
		else {
			System.out.println("c > b > a");
		}
	
	
	
	
	}
	

}
