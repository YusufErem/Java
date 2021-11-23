import java.util.Scanner;

public class UcakBiletiFiyatHesaplayýcý {

	public static void main(String[] args) {
		// Km birim fiyatý 10$
		//12 yaþýndan küçükse %50 indirim
		//12 24 yaþ arasýndaysa 10
		//65 yaþýndan büyükse %30
		//gidiþ dönüþ bileti alýrsa %20 indirim yapýlcak
		Scanner input = new Scanner(System.in);
		int km, yas, tip;
		System.out.print("Uççuþ Mesafesini Giriniz: ");
		km = input.nextInt();
		System.out.print("\nYaþýnýzý giriniz: ");
		yas =input.nextInt();
		System.out.print("\nUçuþ tipinizi seçiniz: (1-Tek Gidiþ , 2- Gidiþ Dönüþ): " );
		tip =input.nextInt();
		
		double normalfiyat = km;
		double cocukindirimli = km*0.5;
		double gencindirimli = km*0.10;
		double yaþlýindirimli = km*0.30;
		double gidisdonusindirimli = 2*km*0.20;
		double normaliki =normalfiyat*0.2;
		double cocukiki = cocukindirimli*0.2;
		double genciki = gencindirimli*0.2;
		double yasliiki = yaþlýindirimli*0.2;
		
		
		if (yas > 0 && km > 0 && tip==1 || tip==2) {
		

		if (yas<=12)
		System.out.println("bilet fiyatýnýz: "+ cocukindirimli+"$");
		else if (yas<=12 && tip==2) {
			System.out.println("Bilet fiyatýnýz: "+ cocukiki+"$");	
		}
		else if (yas>12 && yas<=24) {
			System.out.println("Bilet fiyatýnýz: "+ gencindirimli+"$");
		}
		else if (yas>12 && yas<=24 && tip==2) {
			System.out.println(" Bilet Fiyatýnýz: "+ genciki+"$");
		}
		else if (yas>=65) {
			System.out.println("Bilet fiyatýnýz: "+ yaþlýindirimli+"$");
		}
		else if (yas>=65 && tip==2) {
			System.out.println("Bilet fiyatýnýz: "+ yasliiki+"$");
			
		}
		else if (tip==2) {
			System.out.println("Bilet fiyatýnýz:"+ normaliki+"$");
			
		}
			
		else {
			System.out.println("Bilet Fiyatýnýz: "+normalfiyat+"$");
		}
			
			
		}
else {
			System.out.println("Girdiðiniz Deðerler yanlýþ veya eksikdir.");
		}
	}

}
