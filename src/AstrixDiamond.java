
public class AstrixDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int z = 1; z<=5; z=z+1){
			
			for (int b = 5-z; b>=1; b--){
				System.out.print(" ");
			}
			
			for (int a = z; a >=1; a=a-1){
				System.out.print("**");
			}
			
			System.out.println();
		}
		for (int z = 1; z<=5; z=z+1){
			
			for (int b = z; b>=1; b--){
				System.out.print(" ");
			}
			
			for (int a = 5-z; a >=1; a--){
				System.out.print("**");
			}
			
			System.out.println();
		}
		
		
		

	}

}
