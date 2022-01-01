package kalıtım;

public class Memur extends Calisan {
	private String departman;
	private int mesai;
	public Memur(String adsoyad, String eposta, int telefon, String departman, int mesai) {
		super(adsoyad, eposta, telefon);
		this.departman = departman;
		this.mesai = mesai;
	}
	public String getDepartman() {
		return departman;
	}
	public void setDepartman(String departman) {
		this.departman = departman;
	}
	public int getMesai() {
		return mesai;
	}
	public void setMesai(int mesai) {
		this.mesai = mesai;
	}
	
	public void calis() {
		
	}

}
