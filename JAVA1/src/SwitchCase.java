import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen 1 ile 3 aras�nda say� giriniz: ");
		int say� = input.nextInt();
		
		switch(say�){ 
		case 1:
			System.out.println("say� 1'e e�ittir.");
		break;
		case 2:
			System.out.println("say� 2'ye e�ittir.");
		break;
		case 3:
			System.out.println("say� 3'e e�ittir.");
		break;
		default:
			System.out.println("ge�ersiz say� girdiniz");
		
		;
		
		
		
		}
	}

}
