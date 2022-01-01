import java.util.Scanner;
public class breakvecontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		while(true) {
			int a;
		System.out.println("lütfen bir sayý giriniz 10 dan az : ");
		a = input.nextInt();
		if (a==10) {
			System.out.println("döngü bitti");
			break;
		}
			
	}
		
		for(int b= 1 ; b<=10; b++) {
			if( b==4 || b==5) {
				System.out.println("ÖNEMLÝ SAYI: "+ b);
				continue;
					
			}
		System.out.println("b= "+ b);
		}
		
		
		
		
		
	}

}
