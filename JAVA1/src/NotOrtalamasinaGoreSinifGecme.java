import java.util.Scanner;

public class NotOrtalamasinaGoreSinifGecme {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
		double mat,fizik,kimya,biyoloji;
		
		
		System.out.print("l�tfen matematik notunuzu giriniz: ");
		mat = input.nextDouble();
		System.out.print("L�tfen kimya notunuzu giriniz: ");
		kimya = input.nextDouble()	;
		System.out.print("L�tfen Fizik notunuzu giriniz: ");
		fizik = input.nextDouble();
		System.out.print("L�tfen Biyoloji notunuzu giriniz: ");
		biyoloji = input.nextDouble();
		
	
		double ortalama = ((mat+fizik+kimya+biyoloji)/4) ;
		System.out.println("Not Ortalaman�z: "+ ortalama);
		if (ortalama<50) {
			System.out.println("S�n�f� Ge�emediniz");
			
		}
		else if( ortalama == 50) {
			System.out.println("s�n�f� zorlan ge�tiniz");
			
		}
		else {
			System.out.println("s�n�f� rahatl�kla  ge�tiniz");
		}
	}

}
