import java.util.Scanner;

public class NotOrtalamaHesabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int vize , finall , quiz ;
		double ortalama ;
		Scanner input = new Scanner(System.in);
	    System.out.print("quiz notunuzu giriniz: ");
		quiz = input.nextInt();
		System.out.print("l�tfen vize notunu giriniz: " );   
		vize = input.nextInt();
		System.out.print("L�tfen final notunu giriniz: ");
		finall = input.nextInt();
		ortalama = ((finall*0.5)+(vize*0.3)+(quiz*0.2));
		System.out.println("not ortalaman�z: "+ ortalama );
		 String sonuc = (ortalama<=50) ? "kald�n�z":"ge�tiniz";
		 System.out.println(sonuc);
		
		
		
		
		
		
		
				
		
		
		
		
		
	}

	

}
