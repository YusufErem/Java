import java.util.Scanner;

public class EtkinlikOnerenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
Scanner input = new Scanner(System.in);
		
		int havas�cakl�g�;
		System.out.print("L�tfen hava s�cakl���n� giriniz: ");
		havas�cakl�g� = input.nextInt();
		
		if(havas�cakl�g�>=30) {
			System.out.println("\nY�zmeye Gitmenizi �neririm.");
		}
		else if (5<=havas�cakl�g� && havas�cakl�g�<30  ) {
			System.out.println("\nSinemaya Gitmeniz �nerilir.");
		}
		else if (havas�cakl�g�<=4) {
			System.out.println("\nKayak yapman�z �nerilir.");
		}
	}

}
