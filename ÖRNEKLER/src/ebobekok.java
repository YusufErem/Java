import java.util.Scanner;
public class ebobekok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EKOK = 12 24 4 mesela  -- yazýp küçülen bir döngü
		Scanner input = new Scanner (System.in);
		int kucuksayý,buyuksayý;
		
		System.out.println("Lütfen iki sayý giriniz  ");
		kucuksayý = input.nextInt();
		buyuksayý = input.nextInt();
		 
		int min = (kucuksayý<buyuksayý) ? kucuksayý:buyuksayý ;
		
		 
		
		  for( int i = kucuksayý ; i>0; i-- ) {
			 if (kucuksayý%i == 0 && buyuksayý%i==0)
		  { System.out.println("ebob"+ i);
		    break; 
		    }
		 }
		 
		  for( int m = buyuksayý ; m>=buyuksayý; m++ ) {
			 if((m%kucuksayý==0) && (m%buyuksayý==0)) {
				 System.out.println("ekok"+m);
			 break;
			 }
			 
		 }
		
		
		
	}

}
