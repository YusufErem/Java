import java.util.Scanner;
public class ebobekok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EKOK = 12 24 4 mesela  -- yaz�p k���len bir d�ng�
		Scanner input = new Scanner (System.in);
		int kucuksay�,buyuksay�;
		
		System.out.println("L�tfen iki say� giriniz  ");
		kucuksay� = input.nextInt();
		buyuksay� = input.nextInt();
		 
		int min = (kucuksay�<buyuksay�) ? kucuksay�:buyuksay� ;
		
		 
		
		  for( int i = kucuksay� ; i>0; i-- ) {
			 if (kucuksay�%i == 0 && buyuksay�%i==0)
		  { System.out.println("ebob"+ i);
		    break; 
		    }
		 }
		 
		  for( int m = buyuksay� ; m>=buyuksay�; m++ ) {
			 if((m%kucuksay�==0) && (m%buyuksay�==0)) {
				 System.out.println("ekok"+m);
			 break;
			 }
			 
		 }
		
		
		
	}

}
