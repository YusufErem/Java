package kalýtým;

public class Asistan extends Akademisyen {
	
	String yukseklisans;
	
	public Asistan(String adsoyad,int telefon, String eposta, String bolum, String gorev, String[] dersler,String yukseklisans) {
		super(adsoyad,eposta,telefon,bolum,gorev,dersler);
		
		this.yukseklisans=yukseklisans;
		
		
	}

	
	
	public void lablaragir() {
		
	}

}
