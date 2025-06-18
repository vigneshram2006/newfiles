package java__brocode;

public class IIDarrays {

	public static void main(String[] args) {
		
		String[][] groceries= { {"carrot","onion","beetroot"},
	                          	{"orange","pineapple","apple"},
	                          	{"fish","chiken","steak"}};
		
		for(String[] foods:groceries) {
			for(String food :foods ) {
				System.out.print(food+" ");
				
			}
			System.out.println();
			
		}
		}

}
