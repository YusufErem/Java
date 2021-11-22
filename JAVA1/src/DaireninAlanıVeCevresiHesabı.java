import java.util.Scanner;


public class DaireninAlanýVeCevresiHesabý {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double alan, cevre;
		double pi = 3.14 ,yarýcap;
		System.out.print("Lüten dairenin yarýçapýný giriniz: ");
		yarýcap = input.nextDouble();
		
		cevre = 2*pi*yarýcap;
		alan = pi*(yarýcap*yarýcap);
		
		System.out.println("Dairenin alaný: "+ alan);
		System.out.println("Dairenin Çevresi: "+ cevre);
		
		
		
		
		
		
	}

}
