import java.util.Scanner;


public class DaireninAlan�VeCevresiHesab� {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double alan, cevre;
		double pi = 3.14 ,yar�cap;
		System.out.print("L�ten dairenin yar��ap�n� giriniz: ");
		yar�cap = input.nextDouble();
		
		cevre = 2*pi*yar�cap;
		alan = pi*(yar�cap*yar�cap);
		
		System.out.println("Dairenin alan�: "+ alan);
		System.out.println("Dairenin �evresi: "+ cevre);
		
		
		
		
		
		
	}

}
