import java.util.Scanner;

public class NotOrtalamaHesabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int vize , finall , quiz ;
		double ortalama ;
		Scanner input = new Scanner(System.in);
	    System.out.print("quiz notunuzu giriniz: ");
		quiz = input.nextInt();
		System.out.print("lütfen vize notunu giriniz: " );   
		vize = input.nextInt();
		System.out.print("Lütfen final notunu giriniz: ");
		finall = input.nextInt();
		ortalama = ((finall*0.5)+(vize*0.3)+(quiz*0.2));
		System.out.println("not ortalamanýz: "+ ortalama );
		 String sonuc = (ortalama<=50) ? "kaldýnýz":"geçtiniz";
		 System.out.println(sonuc);
		
		
		
		
		
		
		
				
		
		
		
		
		
	}

	

}
