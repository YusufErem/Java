
public class Sarmallama {

	
	public String name,author,publisher;
	public int numberOfPage; 
	
	Sarmallama(String name, int numberOfPage,String author, String publisher ){
		
	
	this.name= name;
	this.author = author;
	this.publisher = publisher;
	if(numberOfPage < 1) {
		this.numberOfPage = 0;
	}
	else {
		this.numberOfPage = numberOfPage;
		
	}
	
	
	
	
	
	
	}
	
	
	
}
