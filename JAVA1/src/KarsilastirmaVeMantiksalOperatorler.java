
public class KarsilastirmaVeMantiksalOperatorler {

	public static void main(String[] args) {
		
		
		//    	KARSILASTIRMA OPERATÖRLER
		
		//       == ifadesi eþittir 
		//       != ifadesi eþit deðildir
		
		
		//      MANTIKSAL OPERATÖRLER (true false deðerleri döndürür.)
		
		//		 >= 		büyük eþit
		//		 <= 		küçük eþit	
		//       &&         ve anlamýna gelir ve de  1 1 olmadan 1 olmaz   
		// 		 || 	  	veya anlamýna gelir ve 0 0 olmadan 0 olmaz 
		
		
		//  	!   ifadesi deðili gösterir sonucun tersi gibi 	
		
		int a = 5 ;
		int b = 10 ;		
		int c = 15;
		int d = 20;
				
		System.out.println(a==b); //bunu boolean ile de yapabilirdik
		
		boolean kosul1 = a>b;
		boolean kosul2 = c<d;
		
		boolean sonuc = kosul1 && kosul2;
		System.out.println(sonuc);
		
		
		System.out.println(kosul1 || kosul2);

		System.out.println(!(kosul1 || kosul2));


	}

}
