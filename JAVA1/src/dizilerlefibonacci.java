
public class dizilerlefibonacci {
	
	public static int maks(int a,int b) {	
		System.out.println("Girilen sayýlar " + a + ", "+ b);
		if (a>b)
			return a;
		return b;
	}
	public static String al(String isim) {
		return isim;	
	}
	public static void dondur(String isim) {
		System.out.println("merhaba "+ isim);
	}
	public static void main(String[] args) {
		
		int max = maks(5,6);
		System.out.println(max);
		System.out.println(al("ahmet"));
		dondur("mehemtt");
	}

}
