import java.util.Scanner;

public class UcakBiletiFiyatHesaplay�c� {

	public static void main(String[] args) {
		// Km birim fiyat� 10$
		//12 ya��ndan k���kse %50 indirim
		//12 24 ya� aras�ndaysa 10
		//65 ya��ndan b�y�kse %30
		//gidi� d�n�� bileti al�rsa %20 indirim yap�lcak
		Scanner input = new Scanner(System.in);
		int km, yas, tip;
		System.out.print("U��u� Mesafesini Giriniz: ");
		km = input.nextInt();
		System.out.print("\nYa��n�z� giriniz: ");
		yas =input.nextInt();
		System.out.print("\nU�u� tipinizi se�iniz: (1-Tek Gidi� , 2- Gidi� D�n��): " );
		tip =input.nextInt();
		
		double normalfiyat = km;
		double cocukindirimli = km*0.5;
		double gencindirimli = km*0.10;
		double ya�l�indirimli = km*0.30;
		double gidisdonusindirimli = 2*km*0.20;
		double normaliki =normalfiyat*0.2;
		double cocukiki = cocukindirimli*0.2;
		double genciki = gencindirimli*0.2;
		double yasliiki = ya�l�indirimli*0.2;
		
		
		if (yas > 0 && km > 0 && tip==1 || tip==2) {
		

		if (yas<=12)
		System.out.println("bilet fiyat�n�z: "+ cocukindirimli+"$");
		else if (yas<=12 && tip==2) {
			System.out.println("Bilet fiyat�n�z: "+ cocukiki+"$");	
		}
		else if (yas>12 && yas<=24) {
			System.out.println("Bilet fiyat�n�z: "+ gencindirimli+"$");
		}
		else if (yas>12 && yas<=24 && tip==2) {
			System.out.println(" Bilet Fiyat�n�z: "+ genciki+"$");
		}
		else if (yas>=65) {
			System.out.println("Bilet fiyat�n�z: "+ ya�l�indirimli+"$");
		}
		else if (yas>=65 && tip==2) {
			System.out.println("Bilet fiyat�n�z: "+ yasliiki+"$");
			
		}
		else if (tip==2) {
			System.out.println("Bilet fiyat�n�z:"+ normaliki+"$");
			
		}
			
		else {
			System.out.println("Bilet Fiyat�n�z: "+normalfiyat+"$");
		}
			
			
		}
else {
			System.out.println("Girdi�iniz De�erler yanl�� veya eksikdir.");
		}
	}

}
