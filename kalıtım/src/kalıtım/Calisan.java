package kalýtým;

public class Calisan {
	private String adsoyad,eposta;
	protected int telefon;
	public Calisan(String adsoyad,String eposta,int telefon) {
		this.adsoyad=adsoyad;
		this.eposta=eposta;
		this.telefon=telefon;
		
	}
	public void giris() {
		System.out.println("Giriþ Yapýldý");

	
}
	public String getAdsoyad() {
		return adsoyad;
	}
	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}












}
