
public class diziler2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int tablo[][] = new int [][] {
			
			 {1,2,3},
			 {4,5,6}	
		};
				for(int i = 0 ; i<tablo.length ; i++ ) {
					 for(int j =0 ; j <tablo[0].length ;j++);
				//System.out.print(tablo[i][j] + " ");
				//System.out.println("-------------");
		}			
		
				
				int liste[] = new int[4];
				liste[0] =1;
				liste[1] = 2;
				
				for(int i =0 ; i< liste.length; i++) {
					int value = liste[i];
					System.out.println(liste[i]);
				}
				
				System.out.println("--------");
				for (int value :liste) {
					System.out.println(value);
				}
	
	for(int[] sutun : tablo) {
		for (int value : sutun) {
			System.out.print(value);
		}
	}
	
	}			 
	

}
