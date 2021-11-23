import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
			 
		
		int secim;
		double sayý1,sayý2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen birinci sayýyý giriniz: ");
		sayý1 = input.nextInt();
		System.out.print("Lütfen ikinci sayýyý giriniz: ");
		sayý2 = input.nextInt();
		
		System.out.print("Hangi iþlemi yapmak istiyorsanýz yanýndaki rakamý giriniz.\n1-toplama\n2-çýkarman\n3-çarpma\n4-bölme");
		System.out.println("\n------");
		System.out.print("\nseçiminiz: ");
		secim  = input.nextInt();
		
		if (secim==1) {
			System.out.println(sayý1+sayý2);
			}
		
		else if (secim==2) {
			System.out.println(sayý1-sayý2);
		}
		else if(secim==3) {
			System.out.println(sayý1*sayý2);
		}
		else if (secim==4) {
			System.out.println(sayý1/sayý2);
			
		}
		
		else {		
		
			System.out.println("ekrandaki sayýlardan birini seçmediniz.");
			
			
			
			
			
		}
		
		
	}

}
