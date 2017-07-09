
public class AmazingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HEEEEEELLLO
		int [] x = new int[50];
		
		for (int a=1; a<=100;a+=2){
			
			x[(a-1)/2]=a;
		}
		
		for (int b=0; b<=49;b++){
			System.out.println(x[b]);
		}

	}

}
