import java.util.Scanner;
public class Whileornek2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// faktoriel hesabo
		
		Scanner input = new Scanner(System.in);
	

		
		/* FAKT�R�EL �RNEK
		int f;
		System.out.print("L�tfen bir say� giriniz: ");
		f = input.nextInt();
		
			int sonuc = 1;
			while(f>0) {
				sonuc=f*sonuc;
				f--;
			}
		System.out.println(sonuc);
			
		*/	
	/*
		System.out.print("L�tfen bir say� giriniz: ");
		double h  = input.nextInt();
		double harmonic =0.0;
		while (h>0) {
			harmonic =harmonic+(1/h);
			
			h--;
			
			
		}
		
		System.out.println(harmonic);
		
		
*/		
	/*	int star = input.nextInt();
		int i = 1;
		while(i>=1) {
			int k =1 ;
			while(k<=i) {
				System.out.println("*");
				k++;
			}
			i++;
			
		}
		
		
		*/
		
		
		
		
		int say�1,say�2,sonuc=1;
		System.out.println("l�tfen ilk say� gir ");
		say�1 = input.nextInt();
		System.out.println("l�tfen say� 2 gir");
		say�2 =input.nextInt();
		int i =1;
		while (say�2>=i) {
			sonuc =sonuc*say�1;
			i++;	
			}
		System.out.println(sonuc);	
		}
	
	

}
