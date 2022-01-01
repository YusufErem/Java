import java.util.Scanner;
public class Whileornek2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// faktoriel hesabo
		
		Scanner input = new Scanner(System.in);
	

		
		/* FAKTÖRÝEL ÖRNEK
		int f;
		System.out.print("Lütfen bir sayý giriniz: ");
		f = input.nextInt();
		
			int sonuc = 1;
			while(f>0) {
				sonuc=f*sonuc;
				f--;
			}
		System.out.println(sonuc);
			
		*/	
	/*
		System.out.print("Lütfen bir sayý giriniz: ");
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
		
		
		
		
		int sayý1,sayý2,sonuc=1;
		System.out.println("lütfen ilk sayý gir ");
		sayý1 = input.nextInt();
		System.out.println("lütfen sayý 2 gir");
		sayý2 =input.nextInt();
		int i =1;
		while (sayý2>=i) {
			sonuc =sonuc*sayý1;
			i++;	
			}
		System.out.println(sonuc);	
		}
	
	

}
