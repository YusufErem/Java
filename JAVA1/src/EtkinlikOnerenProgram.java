import java.util.Scanner;

public class EtkinlikOnerenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
Scanner input = new Scanner(System.in);
		
		int havasýcaklýgý;
		System.out.print("Lütfen hava sýcaklýðýný giriniz: ");
		havasýcaklýgý = input.nextInt();
		
		if(havasýcaklýgý>=30) {
			System.out.println("\nYüzmeye Gitmenizi Öneririm.");
		}
		else if (5<=havasýcaklýgý && havasýcaklýgý<30  ) {
			System.out.println("\nSinemaya Gitmeniz Önerilir.");
		}
		else if (havasýcaklýgý<=4) {
			System.out.println("\nKayak yapmanýz Önerilir.");
		}
	}

}
