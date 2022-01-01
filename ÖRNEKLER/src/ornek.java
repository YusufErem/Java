
public class ornek {

	public static void main(String[] args) {
		// 153     1 125 27
     int a,b,o,y,toplam;
    for(int i =100; i<999; i++ ) {
    	
    	a = i;
    	
    	b = a%10;
    	a = a/10;
    			
    	o = a%10;
    	a = a/10;
    	
    	y =a%10;
    	
    	a = a/10;
    	toplam = ( b*b*b +o*o*o+y*y*y);
    	
    if (toplam ==  i) {
    	System.out.println(i);
    }
    
    	
    			
    			
    	
    	
    			
    	
    			
    
    	
    
    }
    
		
	}

}
