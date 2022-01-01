import java.util.Scanner;
public class whileOrnek {
			//1 den 100 e kadar çift sayýlarý yazan program
			
			//negatif bir deðer girene kadar kullanýcýdan giriþleri kabul eden
			//ve girilern deðierlerden tek sayýlarý toplayan program
			
			//girilen sayýya kadar olan 2 nin kuvvetini bulunuz
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	/*int i =0;
		while (i<=100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}	
		i++;
		}
		*/	

	/*
	 * int toplam=0; int input;
	 * 
	 * while(true) { System.out.println("lütfen bir sayý giriniz:" ); input =
	 * scan.nextInt(); if (input% 2==1) { toplam =toplam+input;
	 * 
	 * } if (input < 0) { System.out.println("negatif deðer girdiniz. ");
	 * System.out.println("girilen tek sayýlarýn topalý: "+ toplam ); break; }
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
		
		System.out.println("Lütfen bir sayý giriniz: ");
		int input = scan.nextInt();
		int a = 2;
		
		while (a<=input) { // a inputtan küçük olduðu sürece bu döngü çalýþssýn demek anlamýna geliyor.
		System.out.println(a);	
			a =a*2;
		
		}
		
		
		
		
		
		
		
		
	}

}
