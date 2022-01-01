package kalýtým;

public class Akademisyen extends Calisan{
 
	
		// TODO Auto-generated constructor stub
	

	String bolum,gorev;
	String[] dersler;
	
	public Akademisyen(String adsoyad, String eposta, int telefon , String bolum, String gorev, String[] dersler) {
		super(adsoyad,eposta,telefon);
		
		this.bolum = bolum;
		this.gorev = gorev;
		this.dersler = dersler;
	}

	public void dersegir() {
		
	}

	public String Getbolum() {
		return bolum;
	}

	public void SetBolum() {
		this.bolum=bolum;			
	}
	public String GetGorev() {
		return gorev;		
	}
	public void SetGorev() {
		this.gorev=gorev;
	}
	public String[] Getdersler() {
		return dersler;
	}
	public void Setdersler() {
		this.dersler=dersler;
	}
	
	

}