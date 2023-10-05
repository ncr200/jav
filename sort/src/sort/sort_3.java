package sort;
import java.util.ArrayList;
import java.util.List;

public class sort_3 {
	
	public static void main(String[] args) {
		int[] arr = {6, 3, 4, 2, 7, 1, 5};
		List<Integer> list = new ArrayList<>();
		int arr_len = 7;
		for (int count = 0; count < arr_len; count++){
			for (int i = 0; i < arr_len; i++){
				if (arr[i] == count+1) {
					int y = arr[count];
					arr[count] = arr[i];
					arr[i] = y;
				}
				
			}
			for (int ii = 0; ii < arr.length; ii++){
				  System.out.print(arr[ii]);
				}
			System.out.println("");
		}
	}
}
