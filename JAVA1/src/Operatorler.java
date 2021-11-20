
public class Operatorler {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int toplam = a+ b;
		int cikarma = a-b;
		int bolme = a/b;
		int carpma = a*b;
		int mod = a % b;
		
		
		//System.out.println("çarpma "+ carpma +" bolme : " + bolme );
		//System.out.println("mod " + mod);
		//carpma++;
		//System.out.println(carpma);
		
		int sayý1 = 10;
	    int sayý2 = 20;
		
		boolean kosul = (sayý1 == sayý2);
		System.out.println("Eþit mi ?" + kosul);
		boolean kosul2 = (sayý1 / sayý2) == 0;// int yazdýðým doðru ama gerçekte yanlýþ  çünki double yapmam gerek 0.5 için
		System.out.println("bölümü 0 a eþitmi " + kosul2);
		boolean sonuc2 = kosul && kosul2;
		System.out.println(sonuc2);          //&& ve anlamýna gelir ,mantýkta ikiside doðru yani 1 olmadýkça doðru olmaz
		boolean sonuc3 = kosul || kosul2;

		System.out.println(sonuc3); // || veya anlamýna gelir ve ikiside 0 yani yanlýþ olmadýkça yanlýþ olmaz

		
		boolean sonuc4 = (kosul) ? true : false ;
		System.out.println("sonuç 4 :"+ sonuc4);
		boolean sonuc5 = (kosul2) ? true : true ;// buranýn mantýðý doðru ise sol yanlýþ ise sað
		System.out.println("sonuc5 :"+ sonuc5);
		// AYNI MANTIK AÞÞAÐIDA DA GEÇERLÝ SADECE BOOLEAN DEÐÝLDE STRÝNG TANIMLADIM VE DOÐRU YANLIÞ YAPTIM
		String sonuc6 = (kosul)? "doðru": "yanlýþ";
		System.out.println("kosulul doðrumu yanlýþ mý ? = "+ sonuc6);
		//SON ÖRNEK       UNUTMA SOLDAKÝ DOÐRU SAÐDAKÝ YANLIÞ ANLAMINA GELÝR
		String sonuc7 = (a==b)? "doðru":"yanlýþ";
		System.out.println(sonuc7);
		
		
		//ATAMA ÝÞLEMLERÝ
		//sayý1 = sayý1 +2 ; aynýsýdýr sayý1 += 2
		sayý1 = sayý1 + 2;
		System.out.println(sayý1);
		sayý2 += 2;
		System.out.println(sayý2);
		//
		

		
		
		
		
		
	}

}
