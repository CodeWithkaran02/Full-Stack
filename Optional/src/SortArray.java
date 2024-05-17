import java.util.Arrays;
public class SortArray {
	void math1() {
		int arr[] = {1,5,9,4,3,8,3,2,6};
		for(int data: arr) {
			System.out.println(data + " ");
			
//			System.out.println("============After sort ==============");
//			
//			Arrays.sort(arr);
			
			System.out.println("After parallel sorting");
			Arrays.parallelSort(arr,5,7);
			
			for(int data : arr)
				System.out.println(data + " ");
			
				
			
		}
	}
	public static void main(String args []) {
		new SortArray().math1();
		
	}
}
