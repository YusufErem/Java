import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String kullanýcýadý,sifre;
		
		System.out.print("Lüften kullanýcý adýnýzý giriniz: ");
		kullanýcýadý = scan.nextLine();
		System.out.print("Lütfen þifrenizi giriniz: ");
		sifre = scan.nextLine();
		
		if(kullanýcýadý.equals("admin")&& sifre.equals("123"))
		{
		System.out.println("Baþarýlý bir þekilde giriþ yaptýnýz.");
		}else 
		{
		
		 
			System.out.println("parola veya kullanýcý adý hatalý.");
			
		}
		
		
			
		

		

	}

}
