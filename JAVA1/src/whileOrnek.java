import java.util.Scanner;
public class whileOrnek {
			//1 den 100 e kadar �ift say�lar� yazan program
			
			//negatif bir de�er girene kadar kullan�c�dan giri�leri kabul eden
			//ve girilern de�ierlerden tek say�lar� toplayan program
			
			//girilen say�ya kadar olan 2 nin kuvvetini bulunuz
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
	 * while(true) { System.out.println("l�tfen bir say� giriniz:" ); input =
	 * scan.nextInt(); if (input% 2==1) { toplam =toplam+input;
	 * 
	 * } if (input < 0) { System.out.println("negatif de�er girdiniz. ");
	 * System.out.println("girilen tek say�lar�n topal�: "+ toplam ); break; }
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
		
		System.out.println("L�tfen bir say� giriniz: ");
		int input = scan.nextInt();
		int a = 2;
		
		while (a<=input) { // a inputtan k���k oldu�u s�rece bu d�ng� �al��ss�n demek anlam�na geliyor.
		System.out.println(a);	
			a =a*2;
		
		}
		
		
		
		
		
		
		
		
	}

}
