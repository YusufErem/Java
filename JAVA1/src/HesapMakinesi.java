import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
			 
		
		int secim;
		double say�1,say�2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen birinci say�y� giriniz: ");
		say�1 = input.nextInt();
		System.out.print("L�tfen ikinci say�y� giriniz: ");
		say�2 = input.nextInt();
		
		System.out.print("Hangi i�lemi yapmak istiyorsan�z yan�ndaki rakam� giriniz.\n1-toplama\n2-��karman\n3-�arpma\n4-b�lme");
		System.out.println("\n------");
		System.out.print("\nse�iminiz: ");
		secim  = input.nextInt();
		
		if (secim==1) {
			System.out.println(say�1+say�2);
			}
		
		else if (secim==2) {
			System.out.println(say�1-say�2);
		}
		else if(secim==3) {
			System.out.println(say�1*say�2);
		}
		else if (secim==4) {
			System.out.println(say�1/say�2);
			
		}
		
		else {		
		
			System.out.println("ekrandaki say�lardan birini se�mediniz.");
			
			
			
			
			
		}
		
		
	}

}
