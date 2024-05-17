import java.util.Optional;

public class optinal1 {
	void meth1() {
		String arr[] = new String[5];
		arr[1] = "Karuna";
		arr[2] = "karan";
	//	System.out.println(arr[3].toUpperCase());
		
		Optional<String> o = Optional.of(arr[1]);
		
	
		
	}
	
	public static void main(String args []) {
		new optinal1().meth1();
		
	}
	
	
}
