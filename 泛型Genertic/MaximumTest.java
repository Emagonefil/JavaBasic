
public class MaximumTest {

	public static void main(String[] args) {
		
			
		System.out.println(MaximumTest.max(3, 1, 2));
		System.out.println(MaximumTest.max(0, 1, 2));
		

	}
	
	public static <T extends Comparable<T>> T max(T x, T y, T z){
		if(x.compareTo(y) > 0){
			y = x;
		}else{
			x = y;
		}
		
		if(x.compareTo(z)>0 |y.compareTo(z)>0){
			z = x;
		}else{
			x = z;
		}
		return x;
	} 

}
