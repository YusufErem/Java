import java.util.Scanner;
public class forornek {

	public static void main(String[] args) {
		
		// asal sayý bulma
		int sayý;
		boolean asal = true ;
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Lütfen bir sayý giriniz ");
			sayý = input.nextInt();
		}
		while(sayý>1);
			
		for (int i = 1 ; i < sayý; i++) {
			if(sayý%i==0) {
				asal = false;
			break;	
			}
			if (sayý%i==1)	
		}
			
		
		
	}

}
