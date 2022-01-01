package kalýtým;

public class BilgiIslem extends Memur {
	String gorev;
	public BilgiIslem(String adsoyad, String eposta, int telefon, String departman, int mesai, String gorev) {
		super(adsoyad, eposta, telefon, departman, mesai);
		this.gorev = gorev;
	
	}
	
	public String getGorev() {
		return this.gorev;
	}
	public void tarama() {	
		
	}
	
}
