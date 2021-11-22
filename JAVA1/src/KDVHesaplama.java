import java.util.Scanner;

public class KDVHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tutar ,kdvlifiyat;
		double kdv = 0.18;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ürünün tutarýný giriniz: ");
		tutar = input.nextDouble();
		
	    kdvlifiyat = tutar + (tutar*kdv);
	    System.out.println("KDV'li fiyat: "+ kdvlifiyat);
	    
		
		
		
		
		
		
		
	}

}
