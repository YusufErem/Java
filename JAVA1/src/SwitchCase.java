import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen 1 ile 3 arasýnda sayý giriniz: ");
		int sayý = input.nextInt();
		
		switch(sayý){ 
		case 1:
			System.out.println("sayý 1'e eþittir.");
		break;
		case 2:
			System.out.println("sayý 2'ye eþittir.");
		break;
		case 3:
			System.out.println("sayý 3'e eþittir.");
		break;
		default:
			System.out.println("geçersiz sayý girdiniz");
		
		;
		
		
		
		}
	}

}
