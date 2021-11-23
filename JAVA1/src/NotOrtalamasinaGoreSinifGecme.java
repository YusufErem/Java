import java.util.Scanner;

public class NotOrtalamasinaGoreSinifGecme {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
		double mat,fizik,kimya,biyoloji;
		
		
		System.out.print("lütfen matematik notunuzu giriniz: ");
		mat = input.nextDouble();
		System.out.print("Lütfen kimya notunuzu giriniz: ");
		kimya = input.nextDouble()	;
		System.out.print("Lütfen Fizik notunuzu giriniz: ");
		fizik = input.nextDouble();
		System.out.print("Lütfen Biyoloji notunuzu giriniz: ");
		biyoloji = input.nextDouble();
		
	
		double ortalama = ((mat+fizik+kimya+biyoloji)/4) ;
		System.out.println("Not Ortalamanýz: "+ ortalama);
		if (ortalama<50) {
			System.out.println("Sýnýfý Geçemediniz");
			
		}
		else if( ortalama == 50) {
			System.out.println("sýnýfý zorlan geçtiniz");
			
		}
		else {
			System.out.println("sýnýfý rahatlýkla  geçtiniz");
		}
	}

}
