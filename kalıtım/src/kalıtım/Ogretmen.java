package kalýtým;

public class Ogretmen extends Akademisyen{
	String unvan;
		
	public Ogretmen(String adsoyad, String eposta, int telefon, String bolum, String gorev, String[] dersler,
			String unvan) {
		super(adsoyad, eposta, telefon, bolum, gorev, dersler);
		this.unvan = unvan;
	}
	public void toplantýgir() {
		
	}
	public void sýnvalarýoku() {
	
}
}
