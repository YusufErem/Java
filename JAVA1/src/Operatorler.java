
public class Operatorler {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int toplam = a+ b;
		int cikarma = a-b;
		int bolme = a/b;
		int carpma = a*b;
		int mod = a % b;
		
		
		//System.out.println("�arpma "+ carpma +" bolme : " + bolme );
		//System.out.println("mod " + mod);
		//carpma++;
		//System.out.println(carpma);
		
		int say�1 = 10;
	    int say�2 = 20;
		
		boolean kosul = (say�1 == say�2);
		System.out.println("E�it mi ?" + kosul);
		boolean kosul2 = (say�1 / say�2) == 0;// int yazd���m do�ru ama ger�ekte yanl��  ��nki double yapmam gerek 0.5 i�in
		System.out.println("b�l�m� 0 a e�itmi " + kosul2);
		boolean sonuc2 = kosul && kosul2;
		System.out.println(sonuc2);          //&& ve anlam�na gelir ,mant�kta ikiside do�ru yani 1 olmad�k�a do�ru olmaz
		boolean sonuc3 = kosul || kosul2;

		System.out.println(sonuc3); // || veya anlam�na gelir ve ikiside 0 yani yanl�� olmad�k�a yanl�� olmaz

		
		boolean sonuc4 = (kosul) ? true : false ;
		System.out.println("sonu� 4 :"+ sonuc4);
		boolean sonuc5 = (kosul2) ? true : false ;// buran�n mant��� do�ru ise sol yanl�� ise sa�
		System.out.println("sonuc5 :"+ sonuc5);
		// AYNI MANTIK A��A�IDA DA GE�ERL� SADECE BOOLEAN DE��LDE STR�NG TANIMLADIM VE DO�RU YANLI� YAPTIM
		String sonuc6 = (kosul)? "do�ru": "yanl��";
		System.out.println("kosulul do�rumu yanl�� m� ? = "+ sonuc6);
		//SON �RNEK       UNUTMA SOLDAK� DO�RU SA�DAK� YANLI� ANLAMINA GEL�R
		String sonuc7 = (a==b)? "do�ru":"yanl��";
		System.out.println(sonuc7);
		
		
		//ATAMA ��LEMLER�
		//say�1 = say�1 +2 ; ayn�s�d�r say�1 += 2
		say�1 = say�1 + 2;
		System.out.println(say�1);
		say�2 += 2;
		System.out.println(say�2);
		//
		

		
		
		
		
		
	}

}
