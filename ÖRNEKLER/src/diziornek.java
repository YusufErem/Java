import java.util.Scanner;
public class diziornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double toplam = 0 ;
		int [] notlar = new int [4];
		Scanner input = new Scanner(System.in);
		System.out.println("lütfen notlarýnýzý sýrayla giriniz : ");
		System.out.println("mat1");
		notlar[0] = input.nextInt();
		System.out.println("fizik1");
		notlar[1] = input.nextInt();
		System.out.println("kimya");
		notlar[2] = input.nextInt();
		System.out.println("biyoloji");
		notlar[3] = input.nextInt();
		
				for ( int not : notlar) {
					toplam =toplam+not;
					
				}
	
	System.out.println("ortalama: "+ toplam/notlar.length);
	}
	

}
