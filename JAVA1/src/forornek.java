import java.util.Scanner;
public class forornek {

	public static void main(String[] args) {
		
		// asal say� bulma
		int say�;
		boolean asal = true ;
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("L�tfen bir say� giriniz ");
			say� = input.nextInt();
		}
		while(say�>1);
			
		for (int i = 1 ; i < say�; i++) {
			if(say�%i==0) {
				asal = false;
			break;	
			}
			if (say�%i==1)	
		}
			
		
		
	}

}
