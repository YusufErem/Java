import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String kullan�c�ad�,sifre;
		
		System.out.print("L�ften kullan�c� ad�n�z� giriniz: ");
		kullan�c�ad� = scan.nextLine();
		System.out.print("L�tfen �ifrenizi giriniz: ");
		sifre = scan.nextLine();
		
		if(kullan�c�ad�.equals("admin")&& sifre.equals("123"))
		{
		System.out.println("Ba�ar�l� bir �ekilde giri� yapt�n�z.");
		}else 
		{
		
		 
			System.out.println("parola veya kullan�c� ad� hatal�.");
			
		}
		
		
			
		

		

	}

}
