import java.util.Scanner;
public class fonksiyonlar1 {

	static int f(int a,int b) {
		Scanner input = new Scanner(System.in);
		
		//System.out.println("L�tfen �s'lerinin al�nmas�n� iste�iniz de�erlerini giriniz ");
	    //a = input.nextInt();
	    //b = input.nextInt();
	    int  result = 1;
		for ( int i = 1; i<=b; i++) {
	    	 
	    	result  = result*a;
	    	
	    
	   
	    }
	    System.out.println("sonucunz: "+ result);
		return result;
	
	}
	
	
	
	
	public static void main(String[] args) {
f(12,2);







//ARTIK �SL� ALAN B�R FONKS�YON VAR.







	}

}
